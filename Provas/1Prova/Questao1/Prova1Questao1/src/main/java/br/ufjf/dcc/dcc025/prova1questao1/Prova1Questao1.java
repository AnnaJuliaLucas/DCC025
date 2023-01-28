package br.ufjf.dcc.dcc025.prova1questao1;

import java.util.Scanner;

/**
 *
 * @author anna
 */
public class Prova1Questao1 {

    public static void main(String[] args) {
        System.out.println("Questão 1");
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a rota desejada para a Ambulância: ");
        String input = teclado.nextLine();
        Rota rota = new Rota(input);

        if (rota.ehValida()) {
            System.out.println("PONTOS DA ROTA:");
            int pointCounter = 0;
            System.out.println("");
            System.out.println(rota.extraiPontos() + "" + rota.extraiPontos().size());
            
            for (Ponto p : rota.extraiPontos()) {
                System.out.println("P" + Integer.toString(pointCounter));
                System.out.println(p.toSring());
                pointCounter++;
            }
            
            System.out.println("");
            Mapa mapa = new Mapa(rota.extraiPontos());
            mapa.imprime();

            System.out.println("ROTA ORIGINAL: " + rota.getRota());
            System.out.println("DESLOCAMENTO (R. Original): " + rota.deslocamentoTotal());
            System.out.println("ROTA OTIMIZADA: " + rota.rotaOtimizada().getRota());
            System.out.println("DESLOCAMENTO (R. Otimizada): " + rota.rotaOtimizada().deslocamentoTotal());
        }
    }
}
