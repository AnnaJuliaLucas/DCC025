# Jogo da Velha 3D

O Jogo da velha é um passatempo popular em que dois jogadores preenchem, com os símbolos X ou O, os espaços em branco de uma tabela
com três linhas e três colunas. Na Figura 1 é possível visualizar uma configuração inicial do jogo da velha, ainda não preenchido, com suas linhas e colunas.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215828640-e0260dc9-5802-45d2-98b3-925ed145871a.jpeg" width="250px" />
</div>

<p align="center">
Figura 1: Exemplo de um jogo da velha não preenchido
</p>


O Jogo da velha 3D é uma variação que utiliza três tabuleiros, um abaixo do outro, como na Figura 2.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215828953-28473683-3f50-451f-b876-b663f5ffb025.jpeg" width="350px" />
</div>

<p align="center">
Figura 1: Exemplo de um jogo da velha 3D.
</p>


O funcionamento do jogo é organizado em turnos onde cada um dos jogadores pode preencher uma posição vazia com o seu respectivo símbolo. Para preencher uma 
posição o jogador deve dizer a linha, a coluna e a camada em que deseja adicionar o seu símbolo no formato (linha, coluna, camada), onde os valores variam de 1 até 3.


A Figura 3 ilustra as duas primeiras jogadas do Jogo da Velha, supondo que o Jogador 1 utilize a letra “X” e o Jogador 2 utilize a letra “O”. Na primeira jogada, 
o Jogador 1 opta pela posição (1, 1, 3) e deste modo um X é marcado nesta posição. Na segunda jogada, o Jogador 2 escolhe a posição (2,2,2), resultando no cenário
ilustrado mais à direita da figura.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215829277-cf82dabf-240e-477a-8c9b-1ba4aa84ef34.jpeg" width="350px" />
</div>

<p align="center">
Figura 2: Duas rodadas do Jogo da Velha 3D.
</p>

O jogo continua em diversas jogadas até que todas as posições sejam preenchidas ou até que um dos jogadores vença. Um jogador vence o Jogo da Velha quando
preenche com o seu símbolo uma linha, uma coluna ou uma diagonal do mesmo plano ou de diferentes planos como é ilustrado na Figura 3.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215830158-c672196e-dcbf-4873-9e4a-c3809bdc8104.jpeg" width="250px" />
</div>

<p align="center">
Figura 3: Exemplos em que o Jogador 1 venceria o Jogo da Velha 3D.
</p>

Descrição do jogo Tic-tac-toe 3D - Wikipedia. <br>
Exemplo de implementação online para tabuleiro 4x4x4 Play 3D Noughts and
Crosses (papg.com).

## Implementação 
Implemente um programa em Java que permite que dois jogadores disputem uma partida de Jogo da Velha ou que um jogador dispute 
uma partida contra um “bot”. As seguintes atividades devem ser executadas:

**Atividade 1 (criando a configuração inicial do jogo)**

Criar uma tela de boas-vindas para o jogador e perguntar ao usuário se ele pretende jogar contra um humano ou contra um bot. .


a) Jogo contra humano <br>

  ●  O programa pergunta a cada usuário o seu nome e o símbolo que deseja utilizar. Vale ressaltar que os símbolos devem ser diferentes.

b) Jogo contra um bot<br>

  ●  O programa pergunta ao usuário qual o nome e o símbolo que deseja utilizar e escolhe o símbolo “X” para o bot. Caso o símbolo “X” já tenha 
  sido escolhido pelo jogador, o bot deverá utilizar o símbolo “O”.
  
**Atividade 2 (vamos jogar)**

Após a definição da configuração inicial do jogo, nessa atividade deve ser criada uma tela que possibilita que o(s) jogador(es) realize(m) a(s) sua(s) 
jogada(s) até que um jogador ou bot vença, ou até que todas as posições sejam preenchidas.


O jogo é organizado em turnos onde cada jogador realiza uma jogada. O turno é sempre iniciado pelo Jogador 1 que vai definir a posição na qual deseja jogar 
e depois o oponente, humano ou bot, realiza a sua jogada. Caso um dos jogadores vença o jogo, ele deve ser interrompido imediatamente.

**Atividade 3 (criar o bot)**

Criar uma classe, que dado um cenário do Jogo da Velha 3D, realize uma jogada. As jogadas podem ser realizadas de forma aleatória ou considerando alguma
heurística.

**Atividade 4 (finalizar o jogo)**

Quando um jogador vencer o jogo ou ocorrer um empate, escrever uma mensagem parabenizando o jogador vencedor ou informando o empate. Em seguida, 
pergunte ao(s) jogador(es) se deseja(m) jogar novamente.


#### *Exemplo de Execução:* <br>


                 
               
              Digite o modo de jogo(JxJ - para dois jogadores, ou JxB - para jogar contra o bot): JxJ
              Digite o nome do jogador: Joao
              Digite o simbolo que deseja utilizar durante o jogo: J
              Digite o nome do jogador: Maria
              Digite o simbolo que deseja utilizar durante o jogo: M

              ====> Turno do Joao
              Digite a posicao que deseja jogar no formato (linha, coluna, camada): (0,0,0)
                                      J - - - - - - - -
                                      - - - - - - - - -
                                      - - - - - - - - -
              ====> Turno do Maria
              Digite a posicao que deseja jogar no formato (linha, coluna, camada): (0,0,1)
                                      J - - M - - - - -
                                      - - - - - - - - -
                                      - - - - - - - - -
              ====> Turno do Joao
              Digite a posicao que deseja jogar no formato (linha, coluna, camada): (0,1,0)
                                      J J - M - - - - -
                                      - - - - - - - - -
                                      - - - - - - - - -
              ====> Turno do Maria
              Digite a posicao que deseja jogar no formato (linha, coluna, camada): (0,1,1)
                                      J J - M M - - - -
                                      - - - - - - - - -
                                      - - - - - - - - -
              ====> Turno do Joao
              Digite a posicao que deseja jogar no formato (linha, coluna, camada): (1,2,1)
                                      J J - M M - - - -
                                      - - - - - J - - -
                                      - - - - - - - - -
              ====> Turno do Maria
              Digite a posicao que deseja jogar no formato (linha, coluna, camada): (0,2,2)
                                      J J - M M - - - M
                                      - - - - - J - - -
                                      - - - - - - - - -

              Parabens Maria !
              

**Atividades complementares**

● O programa não deverá permitir jogadas inválidas. Por exemplo, realizar jogadas em linhas e/ou colunas inválidas (-1,4,1);

● O programa deve negar edições nas posições que já foram preenchidas em rodadas anteriores; e

● O programa deverá apresentar (imprimir) toda a tabela do jogo após cada jogada.
              
