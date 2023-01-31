# Escape Game

O Escape Game consiste em um jogo de tabuleiro (10 x 10) onde o jogador deve guiar um personagem de um ponto específico de entrada até uma saída que pode 
estar em qualquer posição do tabuleiro. A Figura 1 apresenta uma versão inicial do tabuleiro onde o personagem está na posição (1, 1) indicada pela letra P, 
as bombas no caminho indicadas pela letra B estão espalhadas em diversas posições como a (3, 3) e a saída é indicada pela letra S na posição (10, 8).


O objetivo do jogador é indicar o caminho que deve ser percorrido pelo personagem através de instruções da forma (sentido, quantidade). O sentido é representado
pelas letras e, d, c e b que significam respectivamente esquerda, direita, cima e baixo; e a quantidade é representada por um valor natural que indica a 
quantidade de quadrados percorridos no sentido determinado. Por exemplo, caso o jogador dê a instrução (d, 5) a posição final do personagem será (1, 6) como 
ilustra a Figura 2.

Vale ressaltar que a saída e as bombas não ficam visíveis ao jogador, e o personagem não pode passar por posições que tenham bombas. Caso isso ocorra, o jogo é 
finalizado com a mensagem “Game over”. Por exemplo, caso o jogador dê uma nova instrução (b, 6), o jogador passará por três bombas e o jogo será finalizado.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215842626-f862d45a-4802-4879-a623-5e83e6ea537d.jpeg" width="350px" />
</div>

<p align="center">
Figura 1: Versão inicial do tabuleiro
</p>

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215842828-b18d7471-dd33-4f27-b76e-7482bd469051.jpeg" width="350px" />
</div>

<p align="center">
Figura 2: Tabuleiro após movimento do jogador
</p>

## Implementação 
Implemente um programa em Java que permite ao usuário jogar o Escape Game. Essa implementação deve contemplar as seguintes atividades:

**Atividade 1 (criando a configuração inicial do jogo)**

Criar uma tela de boas-vindas e perguntar o nível de dificuldade que o jogador deseja, isso definirá a quantidade de bombas distribuídas no tabuleiro e a 
posição de saída de forma aleatória.


Baseado na quantidade de bombas, seu programa deve sortear uma posição para a saída e a quantidade de bombas garantindo que tenha pelo menos um caminho 
válido da posição de entrada (1, 1) até a posição de saída.


Dificuldades:<br>

   ● Fácil: é gerado um tabuleiro com 12 bombas;<br>
   ● Médio: é gerado um tabuleiro com 20 bombas;<br>
   ● Difícil: é gerado um tabuleiro com 30 bombas.
   
 **Atividade 2 (vamos jogar)**

Após a definição da configuração inicial do jogo, crie um laço que vai ler instruções do jogador no formato (sentido, quantidade) até que ele encontre a saída
ou uma bomba. Caso o jogador dê uma instrução que ultrapasse o limite do tabuleiro. Ou seja, resulte em uma posição com linha ou coluna inválida (menor que 1 
ou maior que 10), mantenha-o na posição do atual e peça para o jogador realizar uma nova jogada.


Para fins de aprendizado com o jogo, armazene todas as jogadas em uma lista de instruções. Para os exemplos ilustrados nas figuras 1 e 2, a lista deve conter 
as seguintes instruções:<br>

   ● (d, 5) <br>
   ● (b, 6)
   

**Atividade 3 (finalizar o jogo)**

Quando o jogador guiar o personagem para a saída imprima a mensagem *“Parabéns!”* e quais foram os deslocamentos realizados pelo jogador.


Caso o jogador encontre uma bomba no caminho, imprima a mensagem *“Game Over!”* e os deslocamentos realizados.


Nos dois casos imprima o estado final do tabuleiro mostrando as bombas que não explodiram com o símbolo B e as que explodiram com o símbolo X, e a posição 
de saída com o símbolo S. Em seguida, pergunte se o jogador deseja jogar novamente.

#### *Exemplo de Execução:* <br>


                 
             Bem vindo ao Escape Game!
    Escolha o nível de dificuldade:
    0 - Fácil
    1 - Médio
    2 - Difícil
    0    
            | P | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            (d,2)
    
            | | | P | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            | | | | | | | | | | |
            (b,3)

            | | | | | B | | | | | |
            | | | X | | | | B | | | |
            | | B | | | | | | | | |
            | | | | | | | | B | | |
            | | | | | | | | | | |
            | | | | | | | | | | B |
            | | B | | | B | | | | | |
            | | | | | | | | S | | |
            | B | | | B | | | | | | |
            | | | | | | | B | B | | |
                   Game Over!
    
            Deslocamentos realizados:
            (d,2)
            (b,3)
            Deseja jogar novamente? (S/N)
            N
            
 
 **Atividades complementares**

● O programa deverá imprimir o tabuleiro após cada instrução do jogador; e

● Organize o código utilizando uma estrutura de classes apropriada.
