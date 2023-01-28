import java.util.Scanner;

public class ListePessoas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int tam = 5;

        String[] nomes = new String[tam];
        int[] idades = new int[tam];

        int i = 0;
        do {
            System.out.println("Para a " + (i+1) +"º pessoa informe");
            System.out.print("Nome: ");
            nomes[i] = teclado.nextLine();
            System.out.print("Idade: ");
            idades[i] = Integer.parseInt(teclado.nextLine());
            System.out.println("=====");
        } while (++i < tam);

        OrdemAlfabetica(tam, nomes, idades);

        System.out.println("\n PESSOAS EM ORDEM ALFABÉTICA");
        for (i = 0; i < tam; i++) {
            System.out.println(nomes[i] + ": " + idades[i] + " anos");
        }

        OrdemCrescIdade(tam, idades, nomes);

        System.out.println("\n  PESSOAS EM ORDEM CRESCENTE DE IDADE");
        for (i = 0; i < tam; i++) {
            System.out.println(nomes[i] + ": " + idades[i] + " anos");
        }
    }

    private static void OrdemCrescIdade(int tamanho, int[] vetorInd, String[] vetorSec) {
        /* Variavel utilizada para percorrer o vetor.
      Inicializa com 1 para indicar que o vetor tenha pelo menos 1 elemento. */
        int elementos = 1;
        int inicio, meio, fim;

        /* Percorre os elementos do vetor até chegar no fim do vetor. */
        while (elementos < tamanho) {
            inicio = 0;

            /* Percorre o vetor do inicio + quantidade de elementos ja percorrido,
        até o tamanho do vetor. */
            while (inicio + elementos < tamanho) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;

                /* Caso o fim fique com um tamanho maior, que o tamanho do vetor,
                 então faz o fim ter o mesmo tamanho que o tamanho do vetor. */
                if (fim > tamanho) {
                    fim = tamanho;
                }

                /* Chama o método que faz a intercalação dos valores
                ordenados do vetor. */
                intercalaInt(vetorInd, vetorSec, inicio, meio, fim);

                /* Faz o inicio do vetor ser igual ao fim. */
                inicio = fim;
            }

            /* Percorre o vetor dobrando a quantidade de itens ja ordenados. */
            elementos = elementos * 2;
        }
    }

    private static void OrdemAlfabetica(int tamanho, String[] vetorInd, int[] vetorSec) {

        int elementos = 1;
        int inicio, meio, fim;

        while (elementos < tamanho) {
            inicio = 0;

            while (inicio + elementos < tamanho) {

                meio = inicio + elementos;
                fim = inicio + 2 * elementos;

                if (fim > tamanho) {
                    fim = tamanho;
                }

                intercalaString(vetorInd, vetorSec, inicio, meio, fim);

                inicio = fim;
            }

            elementos = elementos * 2;
        }
    }

    private static void intercalaInt(int[] vetorInd, String[] vetorSec, int inicio, int meio, int fim) {
        /* Vetor utilizado para guardar os valors ordenados. */
        int novoVetorInd[] = new int[fim - inicio];
        String novoVetorSec[] = new String[fim - inicio];

        /* Variavel utilizada para guardar a posicao do inicio do vetor. */
        int i = inicio;
        /* Variavel utilizada para guardar a posição do meio do vetor. */
        int m = meio;
        /* Variavel utilizada para guarda a posição onde os
      valores serão inseridos no novo vetor. */
        int pos = 0;

        /* Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
      não chegar até seu fim, compara os valores entre o inicio e o meio,
      verificando em qual ordem vai guarda-los ordenado.*/
        while (i < meio && m < fim) {
            /* Se o vetor[i] for menor que o vetor[m], então guarda o valor do
        vetor[i] pois este é menor. */
            if (vetorInd[i] <= vetorInd[m]) {
                novoVetorInd[pos] = vetorInd[i];
                novoVetorSec[pos] = vetorSec[i];

                pos = pos + 1;
                i = i + 1;
                // Senão guarda o valor do vetor[m] pois este é o menor.
            } else {
                novoVetorInd[pos] = vetorInd[m];
                novoVetorSec[pos] = vetorSec[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        // Adicionar no vetor os elementos que estão entre o inicio e meio,
        // que ainda não foram adicionados no vetor.
        while (i < meio) {
            novoVetorInd[pos] = vetorInd[i];
            novoVetorSec[pos] = vetorSec[i];
            pos = pos + 1;
            i = i + 1;
        }

        // Adicionar no vetor os elementos que estão entre o meio e o fim,
        // que ainda não foram adicionados no vetor.
        while (m < fim) {
            novoVetorInd[pos] = vetorInd[m];
            novoVetorSec[pos] = vetorSec[m];
            pos = pos + 1;
            m = m + 1;
        }

        // Coloca no vetor os valores já ordenados.
        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetorInd[i] = novoVetorInd[pos];
            vetorSec[i] = novoVetorSec[pos];
        }
    }

    private static void intercalaString(String[] vetorInd, int[] vetorSec, int inicio, int meio, int fim) {
        /* Vetor utilizado para guardar os valors ordenados. */
        String novoVetorInd[] = new String[fim - inicio];
        int novoVetorSec[] = new int[fim - inicio];

        /* Variavel utilizada para guardar a posicao do inicio do vetor. */
        int i = inicio;
        /* Variavel utilizada para guardar a posição do meio do vetor. */
        int m = meio;
        /* Variavel utilizada para guarda a posição onde os
      valores serão inseridos no novo vetor. */
        int pos = 0;

        /* Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
      não chegar até seu fim, compara os valores entre o inicio e o meio,
      verificando em qual ordem vai guarda-los ordenado.*/
        while (i < meio && m < fim) {
            /* Se o vetor[i] for menor que o vetor[m], então guarda o valor do
        vetor[i] pois este é menor. */
            if (vetorInd[i].compareToIgnoreCase(vetorInd[m]) <= 0) {
                novoVetorInd[pos] = vetorInd[i];
                novoVetorSec[pos] = vetorSec[i];

                pos = pos + 1;
                i = i + 1;
                // Senão guarda o valor do vetor[m] pois este é o menor.
            } else {
                novoVetorInd[pos] = vetorInd[m];
                novoVetorSec[pos] = vetorSec[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        // Adicionar no vetor os elementos que estão entre o inicio e meio,
        // que ainda não foram adicionados no vetor.
        while (i < meio) {
            novoVetorInd[pos] = vetorInd[i];
            novoVetorSec[pos] = vetorSec[i];
            pos = pos + 1;
            i = i + 1;
        }

        // Adicionar no vetor os elementos que estão entre o meio e o fim,
        // que ainda não foram adicionados no vetor.
        while (m < fim) {
            novoVetorInd[pos] = vetorInd[m];
            novoVetorSec[pos] = vetorSec[m];
            pos = pos + 1;
            m = m + 1;
        }

        // Coloca no vetor os valores já ordenados.
        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetorInd[i] = novoVetorInd[pos];
            vetorSec[i] = novoVetorSec[pos];
        }
    }

}
