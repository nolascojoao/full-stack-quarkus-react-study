## Blocking and Non-blocking Endpoints

1. **Blocking Endpoints**:
    - In a network communication context, a blocking endpoint is one that waits for a response before continuing program execution.
    - When a program makes a request to a blocking endpoint, it becomes halted (or blocked) until the response is received.
    - This means the program cannot perform other tasks while waiting for the response, which can lead to inefficient utilization of system resources, especially in concurrent environments.

2. **Non-blocking Endpoints**:
    - In contrast, a non-blocking endpoint allows the program to continue execution while awaiting a response.
    - When a request is made to a non-blocking endpoint, the program does not halt but continues execution and periodically checks if the response has arrived.
    - This enables the program to perform other tasks while awaiting the response, potentially resulting in more efficient resource utilization and better responsiveness in concurrent systems.

In summary, blocking endpoints cause the program to wait for a response before continuing, while non-blocking endpoints allow the program to continue execution and subsequently check if the response has arrived. The choice between the two depends on system requirements and considerations of performance and scalability.


## Endpoints Bloqueantes e Não Bloqueantes (PT-BR)

1. **Endpoints Bloqueantes**:
    - Em um contexto de comunicação de rede, um endpoint bloqueante é aquele que espera por uma resposta antes de continuar a execução do programa.
    - Quando um programa faz uma solicitação a um endpoint bloqueante, ele fica parado (ou bloqueado) até que a resposta seja recebida.
    - Isso significa que o programa não pode realizar outras tarefas enquanto aguarda a resposta, o que pode levar a uma utilização ineficiente dos recursos do sistema, especialmente em ambientes concorrentes.

2. **Endpoints Não Bloqueantes**:
    - Em contraste, um endpoint não bloqueante permite que o programa continue a execução enquanto aguarda uma resposta.
    - Quando uma solicitação é feita a um endpoint não bloqueante, o programa não fica parado, mas continua a execução e verifica periodicamente se a resposta chegou.
    - Isso permite que o programa realize outras tarefas enquanto aguarda a resposta, o que pode resultar em uma utilização mais eficiente dos recursos e uma melhor capacidade de resposta em sistemas concorrentes.

Em resumo, endpoints bloqueantes fazem com que o programa aguarde uma resposta antes de continuar, enquanto endpoints não bloqueantes permitem que o programa continue a execução e verifique posteriormente se a resposta chegou. A escolha entre os dois depende dos requisitos do sistema e das considerações de desempenho e escalabilidade.
