import java.util.Scanner;

public class EscapeGame {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Boas-vindas ao Escape Game!");
        String entrada;
        do {
            Jogo jogo = new Jogo(teclado);
            jogo.inicia();
            System.out.println("Deseja jogar novamente? (S/N)");
            do {
                entrada = teclado.nextLine().toUpperCase();
            } while (!(entrada.equals("S") || entrada.equals("N")));
        } while (entrada.equals("S"));

    }
}