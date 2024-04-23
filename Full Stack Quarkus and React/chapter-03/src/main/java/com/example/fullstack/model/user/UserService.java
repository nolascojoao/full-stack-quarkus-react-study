package com.example.fullstack.model.user;

import com.example.fullstack.model.project.Project;
import com.example.fullstack.model.task.Task;
import io.quarkus.elytron.security.common.BcryptUtil;
import io.quarkus.hibernate.reactive.panache.common.WithTransaction;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.hibernate.ObjectNotFoundException;

import java.util.List;

@ApplicationScoped
public class UserService {

    public Uni<User> findById(long id) {
        return User.<User>findById(id)
                .onItem().ifNull().failWith(() -> new ObjectNotFoundException(id, "User"));
    }

    public Uni<User> findByName(String name) {
        return User.find("name", name).firstResult();
        // 'find' is a static query method provided by PanacheEntity to simplify the HQL query
        // from User where name = ?
    }

    public Uni<List<User>> list() {
        return User.listAll();
    }

    @WithTransaction
    public Uni<User> create(User user) {
        user.password = BcryptUtil.bcryptHash(user.password);
        return user.persistAndFlush();
    }

    @WithTransaction
    public Uni<User> update(User user) {
        return findById(user.id)
                .chain(u -> User.getSession())
                .chain(s -> s.merge(user));
    }

    @WithTransaction
    public Uni<Void> delete(long id) {
        return findById(id)
                .chain(u -> Uni.combine().all().unis(
                                        Task.delete("user.id", u.id),
                                        Project.delete("user.id", u.id)
                                ).asTuple()
                                .chain(t -> u.delete())
                );
    }

    public Uni<User> getCurrentUser() {
        // TODO: replace implementation once security is added to the project
        return User.find("order by ID").firstResult();
    }

}
