# processos-GIP
![image](https://github.com/wellingtonhiago/processos-GIP/assets/99920388/f3c91895-1a31-42c9-9025-9979378ef5be)

# README

## Introdução

Bem-vindo ao repositório do projeto `processos-GIP`. Este projeto é uma aplicação Java que gerencia o processo de reserva de férias e preparação para a partida. Ele utiliza o Camunda BPM, uma plataforma de gerenciamento de processos de negócios baseada em Java, para orquestrar o fluxo de trabalho.

## Descrição das Classes

O projeto contém várias classes Java no pacote `br.com.bpmn.Service` que implementam a interface `JavaDelegate` do Camunda. Cada classe representa uma tarefa específica no fluxo de trabalho. Aqui está uma breve descrição de cada classe:

1. `ReservarCabine`: Esta classe é responsável por reservar uma cabine para o cliente. Ela verifica o valor do dinheiro disponível e, com base nisso, reserva uma "Cabine Luxo" se o valor for maior ou igual a 5000, caso contrário, reserva uma "Cabine Simples".

2. `PrepararPartida`: Esta classe verifica o estado e o dinheiro disponível. Se o estado não for "Pernambuco" ou "Alagoas", ou se o dinheiro for menor que 500, ela lança um erro Bpmn.

3. `FimFerias`: Esta classe é responsável por marcar o fim das férias. Ela imprime uma mensagem "Férias finalizadas" quando o método `execute` é chamado.

4. `Ferias`: Esta classe é responsável por marcar o início das férias. Ela imprime uma mensagem "Tirando férias" e pausa a execução por 5 segundos.

5. `ReservarAssento`: Esta classe é responsável por reservar um assento para o cliente. Ela registra a hora atual e imprime uma mensagem "Reservando assento para o cliente" e a hora do voo.

6. `FeriasCanceladas`: Esta classe é responsável por marcar as férias como canceladas. Ela imprime uma mensagem "Férias canceladas" quando o método `execute` é chamado.

## Como Executar

Para executar este projeto, você precisará ter o Java e o Maven instalados em seu ambiente. Depois de clonar o repositório, você pode construir e executar o projeto usando o comando `mvn clean install`.

## Conclusão

Espero que este README forneça uma visão clara do que o projeto faz e como ele funciona. Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para abrir uma issue ou enviar um pull request.

