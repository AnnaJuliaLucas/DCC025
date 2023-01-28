import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double memoria = 0;
        int cmd = 0;

        do {
            System.out.println("Estado da memória: " + memoria);
            exibeOpcoes();
            cmd = Integer.parseInt(teclado.nextLine());

            if (cmd == 5) {
                memoria = 0;
            } else if (cmd != 6) {
                System.out.print("Digite um valor: ");
                double valor = Double.parseDouble(teclado.nextLine());
                memoria = calcula(cmd, memoria, valor);
            }
            System.out.println("=====");
        } while (cmd != 6);
    }

    public static void exibeOpcoes() {
        System.out.println("\n CALCULADORA ");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.println("(5) Limpar memória");
        System.out.println("(6) Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }

    public static double calcula(int cmd, double memoria, double valor) {
        switch (cmd) {
            case 1:  return memoria + valor;
            case 2: return memoria - valor;
            case 3:  return memoria * valor;
            case 4: return memoria / (double) valor;
            default: return 0;
        }
    }
}