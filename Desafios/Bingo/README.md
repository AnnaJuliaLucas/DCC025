# Bingo

O Bingo um jogo onde cada participante recebe uma cartela contendo 24 números, variando de 1 até 75, e vence o jogo o participante que marcar todos os valores primeiro. <br>

Na Figura 1 é possível visualizar um exemplo com a cartela 001 preenchida com valores aleatórios. As cartelas são divididas em 5 colunas: B, I, N, G e O. As colunas B, I, G e O são preenchidas com 5
valores, enquanto a coluna N é preenchida apenas com 4 valores. Vale ressaltar que os valores da coluna B variam de 1 até 15, os valores da coluna I variam de 16 até 30, os valores da coluna N variam de 31 até
45, os valores da coluna G variam de 46 até 60 e os valores da coluna O variam de 61 até 75.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215800135-d51dfeb3-f415-4d15-9098-3148bea0da93.jpeg" width="250px" />
</div>

<p align="center">
Figura 1: Cartela do Bingo sem preenchimento
</p>

Após cada jogador receber a sua cartela, o jogo é iniciado com o sorteio de valores variando de 1 até 75, sem repetição. Por exemplo, considerando que os valores 1, 3, 5, 7, 9, 63, 12, 75 e 60 foram
sorteados, a cartela passa a ser representada pela imagem ilustrada pela Figura 2, onde os valores 3, 7, 12 e 63 estão marcados. Vale ressaltar que os valores de uma coluna devem ser ordenados.


<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215800334-33f6836a-a099-43e1-8de1-9a8012dec007.jpeg" width="250px" />
</div>

<p align="center">
Figura 2: Cartela do Bingo parcialmente preenchida
</p>

O jogo continua até que um dos participantes marque todos os valores de uma linha, uma coluna ou em formato de cruz, de acordo com a regra selecionada. Por exemplo, na Figura 3 é possível visualizar uma cartela
de um vencedor com o modo de jogo de linha/coluna.

<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215800457-9d42c6f2-8dcc-4956-b9ac-87b294662afe.jpeg" width="250px" />
</div>
                                                                                                        
<p align="center">
Figura 3: Cartela do Bingo vitoriosa no formato linha/coluna.
</p>

## Implementação 
Implemente um programa em Java que permite a simulação de um Bingo para N participantes. Essa implementação deve contemplar as seguintes atividades:

**Atividade 1 (criando a configuração inicial do jogo)**

Criar uma tela de boas-vindas e perguntar a quantidade de jogadores envolvidos na simulação e o tipo de jogo.


a) Tipos de jogo <br>

  ● Linha/coluna: o jogo é finalizado quando um jogador consegue sortear todos os números de uma mesma linha ou coluna. Por exemplo, 
  a cartela apresentada  na Figura 2; 
      
   ● Cruz: o jogo é finalizado quando um jogador consegue sortear todos os números localizados na coluna e linha do meio dacartela  
   (coluna 3 e linha 3, exemplo apresentado na Figura 3).
   
<div align="center">
<img src="https://user-images.githubusercontent.com/104040807/215817875-a734f20c-c20a-479b-9c53-7c21ed71304d.jpeg" width="250px" />
</div>
                                                                                                        
<p align="center">
Figura 3: Cartela do Bingo vitoriosa no formato cruz
</p>

Baseado na quantidade de jogadores, seu programa deve sortear uma cartela para cada jogador. Cada cartela deve conter 24 números, seguindo as regras do Bingo,
e o número sequencial da cartela. (É necessário utilizar um atributo estático nesse exercício)

**Atividade 2 (vamos jogar?)**

Após a definição da configuração inicial do jogo, com a quantidade de jogadores e a sua cartela, a simulação deverá ocorrer em turnos onde um valor é 
sorteado e as cartelas são atualizadas, caso possuam o valor sorteado. No final de cada turno, as cartelas devem ser impressas com as atualizações

**Atividade 3 (finalizar o jogo)**

Quando ao menos um jogador vencer o jogo, uma mensagem com o número da(s) cartela(s) campeã(s) deve(m) ser exibida(s)


#### *Exemplo de Execução:* <br>

               Bem vindo ao Bingo!
    Digite o número de jogadores:
    2  
    Digite o modo de jogo:
    1 - Linha
    2 - Cruz
    1
    
              Cartela 1                                   Cartela 2
              B I N G O                                   B I N G O
    [ ]01 [ ]16 [ ]35 [ ]49 [ ]61                 [ ]01 [ ]16 [ ]32 [ ]51 [ ]61
    [ ]04 [ ]17 [ ]40 [ ]50 [ ]62                 [ ]05 [ ]19 [ ]35 [ ]53 [ ]66
    [ ]08 [ ]24 [ ]53 [ ]63                       [ ]10 [ ]20 [ ]54 [ ]69
    [ ]13 [ ]28 [ ]43 [ ]58 [ ]73                 [ ]12 [ ]24 [ ]36 [ ]56 [ ]72
    [ ]15 [ ]29 [ ]44 [ ]59 [ ]74                 [ ]15 [ ]28 [ ]44 [ ]59 [ ]75
    
    
    (Algumas iterações após os início... Parte do output foi omitido para nãoficar muito grande)
    Deseja continuar? (S/N)
     s
     
    O número sorteado foi: 17
    O jogador 1 marcou

              Cartela 1                                    Cartela 2
              B I N G O                                    B I N G O
    [ ]01 [ ]16 [x]35 [ ]49 [x]61                  [ ]01 [ ]16 [ ]32 [x]51 [x]61
    [ ]04 [x]17 [ ]40 [ ]50 [ ]62                  [ ]05 [ ]19 [x]35 [ ]53 [x]66
    [ ]08 [ ]24 [ ]53 [x]63                        [x]10 [ ]20 [x]54 [x]69
    [x]13 [ ]28 [x]43 [ ]58 [x]73                  [x]12 [ ]24 [x]36 [x]56 [ ]72
    [x]15 [ ]29 [x]44 [ ]59 [x]74                  [x]15 [ ]28 [x]44 [ ]59 [x]75

    Deseja continuar? (S/N)
     s

    O número sorteado foi: 47
    Ninguém marcou nesta rodada

              Cartela 1                                      Cartela 2
              B I N G O                                       B I N G O
    [ ]01 [ ]16 [x]35 [ ]49 [x]61             [ ]01 [ ]16 [ ]32 [x]51 [x]61
    [ ]04 [x]17 [ ]40 [ ]50 [ ]62             [ ]05 [ ]19 [x]35 [ ]53 [x]66
    [ ]08 [ ]24 [ ]53 [x]63                   [x]10 [ ]20 [x]54 [x]69
    [x]13 [ ]28 [x]43 [ ]58 [x]73             [x]12 [ ]24 [x]36 [x]56 [ ]72
    [x]15 [ ]29 [x]44 [ ]59 [x]74             [x]15 [ ]28 [x]44 [ ]59 [x]75

    Deseja continuar? (S/N)
     s

    O número sorteado foi: 40
    O jogador 1 marcou

              Cartela 1                                      Cartela 2
              B I N G O                                       B I N G O
    [ ]01 [ ]16 [x]35 [ ]49 [x]61             [ ]01 [ ]16 [ ]32 [x]51 [x]61
    [ ]04 [x]17 [x]40 [ ]50 [ ]62             [ ]05 [ ]19 [x]35 [ ]53 [x]66
    [ ]08 [ ]24 [ ]53 [x]63                   [x]10 [ ]20 [x]54 [x]69
    [x]13 [ ]28 [x]43 [ ]58 [x]73             [x]12 [ ]24 [x]36 [x]56 [ ]72
    [x]15 [ ]29 [x]44 [ ]59 [x]74             [x]15 [ ]28 [x]44 [ ]59 [x]75
 

                     **Fim de jogo! Vitoria da cartela 01**


**Atividades complementares**

● O programa deverá apresentar (imprimir) todas as cartelas do jogo após cada turno; e

● Organize o código utilizando uma estrutura de classes apropriada.
