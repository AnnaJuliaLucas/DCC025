package br.ufjf.dcc.dcc025.prova1questao1;

import java.util.List;

/**
 *
 * @author anna
 */
public class Mapa {

    private final List<Ponto> pontos;

    public Mapa(List<Ponto> pontos) {
        this.pontos = pontos;
    }

    public void imprime(List<Ponto> pontos) {
        int maiorX = 0;
        int menorX = 0;
        int maiorY = 0;
        int menorY = 0;

        for (Ponto p : pontos) {
            if (p.getX() > maiorX) {
                maiorX = p.getX();
            }
            if (p.getX() < menorX) {
                menorX = p.getX();
            }
            if (p.getY() > maiorY) {
                maiorY = p.getY();
            }
            if (p.getY() < menorY) {
                menorY = p.getY();
            }
        }

        int pointCounter = 0;
        for (int i = maiorY + 1; i >= menorY - 1; i--) {
            for (int j = menorX - 1; j <= maiorX + 1; j++) {
                String out = "**";
                if (i == 0 && j == 0) {
                    out = "HO";
                } else {
                    for (Ponto p : pontos) {
                        if (p.getX() == j && p.getY() == i) {

                            System.out.println("XD");

                            out = "P" + Integer.toString(pointCounter);
                            pointCounter++;
                            break;
                        }
                    }
                }
                System.out.print(" " + out + " ");
            }
            System.out.println("");
        }
    }

    public void imprime() {
        int maiorX = 0;
        int menorX = 0;
        int maiorY = 0;
        int menorY = 0;

        for (Ponto p : this.pontos) {
            if (p.getX() > maiorX) {
                maiorX = p.getX();
            }
            if (p.getX() < menorX) {
                menorX = p.getX();
            }
            if (p.getY() > maiorY) {
                maiorY = p.getY();
            }
            if (p.getY() < menorY) {
                menorY = p.getY();
            }
        }
        
        int pointCounter = 0;
        for (int i = maiorY + 1; i >= menorY - 1; i--) {
            for (int j = menorX - 1; j <= maiorX + 1; j++) {
                String out = "**";
                if (i == 0 && j == 0) {
                    out = "HO";
                } else {
                    for (Ponto p : this.pontos) {
                        if (p.getX() == j && p.getY() == i) {
                            out = "P" + Integer.toString(pointCounter);
                            pointCounter++;
                            break;
                        }
                    }
                }
                System.out.print(" " + out + " ");
            }
            System.out.println("");
        }
    }
}
