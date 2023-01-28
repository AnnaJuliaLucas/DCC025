import java.util.Scanner;

public class VerificaNum {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        String divisores = "", cmd = "Y";

        do {
            System.out.println("Digite um número inteiro: ");
            valor = teclado.nextInt();
            teclado.nextInt();

            for (int i = 2; i <= valor / 2; i++) {
                if (valor % i == 0) {
                    divisores += i + ", ";
                }
            }

            if (divisores.isEmpty()) {
                System.out.println("O número " + valor + " eh primo");
            } else {
                System.out.println("O número " + valor + " tem os seguintes divisores:");
                System.out.println("1, " + divisores + valor);
            }

            do {
                System.out.println("Deseja analisar outro número? (S)im ou (N)ão");
                cmd = teclado.next();
            } while (!(cmd.contentEquals("S") || cmd.contentEquals("s") || cmd.contentEquals("N") || cmd.contentEquals("n")));

            divisores = "";
        }while (cmd.contentEquals("S") || cmd.contentEquals("s"));
    }
}

