import java.util.Scanner;

public class AppPessoa {
    public static void main(String[] args) {
        final int tam = 5;
        Pessoa[] listaPessoas = new Pessoa[tam];
        Scanner teclado = new Scanner(System.in);

        System.out.println("== REGISTRO DE PESSOAS ==");

        for (int i = 0; i < tam; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.print("Nome: ");
            pessoa.setNome(teclado.nextLine());
            System.out.print("Idade: ");
            pessoa.setIdade(Integer.parseInt(teclado.nextLine()));
            listaPessoas[i] = pessoa;
        }

        mergeSort(tam, listaPessoas, true);
        System.out.println("\nOrdem alfabética");
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.println(listaPessoas[i].getNome() + ": "
                    + listaPessoas[i].getIdade());
        }

        mergeSort(tam, listaPessoas, false);
        System.out.println("\nOrdem crescente de idade");
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.println(listaPessoas[i].getNome() + ": "
                    + listaPessoas[i].getIdade());
        }
    }

    private static void mergeSort(int tamanho, Pessoa[] vetor, boolean alfabetica) {

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

                if (alfabetica)
                    intercalaString(vetor, inicio, meio, fim);
                else
                    intercalaInt(vetor, inicio, meio, fim);

                inicio = fim;
            }

            elementos = elementos * 2;
        }
    }

    private static void intercalaInt(Pessoa[] vetor, int inicio, int meio, int fim) {
        Pessoa novoVetor[] = new Pessoa[fim - inicio];

        int i = inicio;
        int m = meio;
        int pos = 0;

        while (i < meio && m < fim) {

            if (vetor[i].getIdade() <= vetor[m].getIdade()) {
                novoVetor[pos] = vetor[i];

                pos = pos + 1;
                i = i + 1;

            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }

    private static void intercalaString(Pessoa[] vetor, int inicio, int meio, int fim) {

        Pessoa novoVetor[] = new Pessoa[fim - inicio];

        int i = inicio;
        int m = meio;
        int pos = 0;

        while (i < meio && m < fim) {

            if (vetor[i].getNome().compareToIgnoreCase(vetor[m].getNome()) <= 0) {
                novoVetor[pos] = vetor[i];

                pos = pos + 1;
                i = i + 1;
            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }
}