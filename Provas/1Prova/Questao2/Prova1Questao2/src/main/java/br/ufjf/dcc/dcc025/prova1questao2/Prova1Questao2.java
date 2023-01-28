package br.ufjf.dcc.dcc025.prova1questao2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author anna
 */
public class Prova1Questao2 {

    public static void main(String[] args) {
        System.out.println("Questão 2");
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = teclado.nextLine();
       
        caractere(texto);
    }

    public static void caractere(String texto) {
        Map<Character, Integer> ocorrencias = new HashMap();

        for (int i = 0; i < texto.length(); i++) {
            char aux = texto.charAt(i);
            if (ocorrencias.containsKey(aux)) {
                ocorrencias.put(aux, ocorrencias.get(aux) + 1);

            } else {
                ocorrencias.put(aux, 1);
            }
        }

        for (Map.Entry<Character, Integer> entrada : ocorrencias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

}
 
