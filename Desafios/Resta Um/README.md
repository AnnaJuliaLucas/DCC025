# Resta Um

“Resta um” é um quebra-cabeça no qual o objetivo é, por meio de movimentos válidos, deixar apenas uma peça no tabuleiro. No início do jogo, há 32 peças no tabuleiro,
deixando vazia a posição central. Um movimento consiste em pegar uma peça e fazê-la "saltar" sobre outra peça, sempre na horizontal ou na vertical, terminando em um
espaço vazio. A peça que foi "saltada" é retirada do tabuleiro. O jogo termina quando não é mais possível fazer nenhum outro movimento. Nesta ocasião, o jogador ganha 
se restar apenas uma peça no tabuleiro.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215822577-7291b223-5648-423b-bbd2-ea23c6b04da0.jpeg" width="250px" />
</div>

<p align="center">
Figura 1: Configuração inicial
</p>

## Implementação 
O aluno deve implementar o jogo “Resta 1” em Java utilizando o terminal (não há necessidade de criação de janelas gráficas). As seguintes atividades 
devem ser executadas:

**Atividade 1 (criando a configuração inicial do jogo)**
Crie uma matriz para representar as peças conforme definido na Figura 1.

**Atividade 2 (vamos jogar?)**
Após a definição da configuração inicial do jogo, nessa atividade deve ser criada uma tela com as seguintes opções:

a) Adicionar jogada <br>

  ● Para fazer uma jogada, o usuário entra com o seguinte formato “([linha da peça], [coluna da peça], [linha do espaço em branco], [coluna do espaço em branco])”.
  Por exemplo, a jogada (3, 1, 3, 3) representa que a peça destacada em vermelho na Figura 2(a)(linha=3, coluna=1) será movida para a posição em branco (linha=3, coluna=3) representada na Figura
  2(b). Vale ressaltar que todas as jogadas necessitam ser validadas para evitar jogadas inválidas.
  
<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215822704-53b5a8e8-9033-412f-b14a-5f569a273ef5.jpeg" width="350px" />
</div>

<p align="center">
Figura 2: Exemplo de jogada
</p>

b) Reiniciar o jogo <br>

  ● Para reiniciar o jogo o usuário deve digitar “reiniciar”.
 
c) Sair <br>

  ● Para sair do jogo o usuário deve digitar “sair”.
  

**Atividade 3 (indicar o fim do jogo)**

Criar uma tela que escreva uma mensagem parabenizando o vencedor ou indique que não há mais jogadas possíveis e ofereça a opção de jogar
novamente. A Figura 3 ilustra um fim de jogo para ambas as situações, sendo que representa os espaços vazios e 1 as peças em jogo.


Bingo03
<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215822881-4bf04114-8ea1-40cb-96ad-39dea2c4eb74.jpeg" width="350px" />
</div>
                                                                                                        
<p align="center">
Figura 3: Fim de jogo
</p>


**Atividades complementares**

● O programa não deverá permitir jogadas inválidas. Por exemplo, realizar jogadas em linhas e/ou colunas inválidas (-1,4,6,2), ou em espaços que fogem às regras do jogo; e

● O programa deverá apresentar (imprimir) o tabuleiro do jogo após movimento do jogador
