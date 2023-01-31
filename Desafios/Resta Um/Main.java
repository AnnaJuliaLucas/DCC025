

public class Main {
    public static void main(String[] args) {
        RestaUm jogo = new RestaUm();
        boolean continua = true;
        boolean respondido = false;
        do {
            jogo.interfaceJogo();
            do {
                System.out.print("Deseja jogar novamente? [S/N] ");
                String entrada = jogo.teclado.nextLine();
                if (entrada.compareToIgnoreCase("N") == 0) {
                    continua = false;
                    respondido = true;
                } else if (entrada.compareToIgnoreCase("S") == 0) {
                    continua = true;
                    respondido = true;
                    jogo.populaTabuleiro();
                    System.out.println();
                }
            } while (!respondido);
            respondido = false;
        } while (continua);
        System.out.println("Fim de Jogo!");
    }
}