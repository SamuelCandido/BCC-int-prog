# Documentação do Jogo Batalha Naval

## Visão Geral
Este programa implementa o jogo clássico Batalha Naval em Java. O jogo é jogado em um tabuleiro 8x8 onde o jogador tenta adivinhar a localização de 10 navios distribuídos aleatoriamente.

## Funcionalidades Principais
1. **Inicialização do Jogo:**
   - O jogo começa inicializando dois tabuleiros:
     - `tabu`: Representa o tabuleiro oculto com os navios.
     - `tabuMostra`: Representa o tabuleiro visível ao jogador.
   - Cada posição dos tabuleiros é inicializada com o caractere `'~'`, representando água.

2. **Distribuição dos Navios:**
   - São distribuídos aleatoriamente 10 navios (`'N'`) no tabuleiro `tabu`.

3. **Loop Principal do Jogo:**
   - O jogo continua até que o jogador tenha acertado todos os 10 navios ou tenha feito 3 tentativas.
   - Em cada iteração do loop, o jogador vê o `tabuMostra`, que mostra o estado atual do jogo.

4. **Ataque do Jogador:**
   - O jogador insere as coordenadas de ataque (linha e coluna).
   - O programa verifica se as coordenadas estão dentro dos limites do tabuleiro.
   - Se as coordenadas já foram atacadas anteriormente (`'X'` ou `'O'`), exibe uma mensagem e pede novas coordenadas.

5. **Verificação do Ataque:**
   - Se o ataque acerta um navio (`'N'` em `tabu`), exibe "Voce acertou um navio" e marca `'X'` em `tabuMostra`.
   - Se o ataque não acerta um navio, marca `'O'` em `tabuMostra`.

6. **Condições de Fim de Jogo:**
   - Se o jogador acertar todos os 10 navios, exibe "Você venceu".
   - Se o jogador não acertar todos os navios após 3 tentativas, exibe "Você foi derrotado".

7. **Revelação das Posições dos Navios:**
   - Após o fim do jogo, o programa revela todas as posições dos navios no `tabuMostra`.

8. **Fechamento do Scanner:**
   - O scanner é fechado após o término do jogo para liberar recursos.

## Exemplo de Uso
Para jogar, compile e execute o programa. Insira as coordenadas de ataque quando solicitado e siga as mensagens exibidas no console para determinar o resultado do jogo.

## Observações
- O jogo possui um limite de 3 tentativas para acertar todos os navios.
- As coordenadas válidas são de 0 a 7 para ambas as linhas e colunas do tabuleiro.

---

