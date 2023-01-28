package br.ufjf.dcc.dcc025.prova1questao1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anna
 */
public class Rota {

    private String rota;

    public Rota(String rota) {
        this.rota = rota.toUpperCase();
    }

    public void debug() {
        System.out.println(this.rota);
    }

    public boolean ehValida() {
        int numN = 0, numS = 0, numL = 0, numO = 0;
        for (int i = 0; i < this.rota.length(); i++) {
            char letra = this.rota.charAt(i);
            switch (letra) {
                case 'N' -> numN++;
                case 'S' -> numS++;
                case 'L' -> numL++;
                case 'O' -> numO++;
                case 'P' -> {
                }
                default -> {
                    return false;
                }
            }
        }
        if (numN == numS && numL == numO) {
            return false;
        }
        return true;
    }

    public String getRota() {
        return this.rota;
    }

    public Rota rotaOtimizada() {

        int numN = 0, numS = 0, numL = 0, numO = 0;
        List<String> subrotas = new ArrayList<>();

        for (int i = 0; i < this.rota.length(); i++) {
            char letra = this.rota.charAt(i);
            switch (letra) {
                case 'N' -> numN++;
                case 'S' -> numS++;
                case 'L' -> numL++;
                case 'O' -> numO++;
                case 'P' -> {
                    int deslocamentoH = numL - numO;
                    int deslocamentoV = numN - numS;
                    String hDirection, vDirection;
                    if (deslocamentoH > 0) {
                        hDirection = "L";
                    } else {
                        hDirection = "O";
                    }
                    if (deslocamentoV > 0) {
                        vDirection = "N";
                    } else {
                        vDirection = "S";
                    }
                    String subrota = "";
                    for (int hd = 0; hd <= deslocamentoH; hd++) {
                        subrota = subrota.concat(hDirection);
                    }
                    for (int vd = 0; vd <= deslocamentoV; vd++) {
                        subrota = subrota.concat(vDirection);
                    }
                    subrotas.add(subrota + "P");
                    subrota = "";
                    vDirection = "";
                    hDirection = "";
                    numN = 0;
                    numS = 0;
                    numL = 0;
                    numO = 0;
                }
                default -> {
                }
            }
        }
        
        String rotaCompleta = "";
        
        for (String rota : subrotas) {
            rotaCompleta = rotaCompleta.concat(rota);
        }
        return new Rota(rotaCompleta);
    }
    
    public int deslocamentoTotal(){
    
        String aux = this.rota.replace("P", "");
        return aux.length();
    }
    
    public List<Ponto> extraiPontos(){
        
        int numN = 0, numS = 0, numL = 0, numO = 0;
        List<Ponto> pontos = new ArrayList<>();
        
         for (int i = 0; i < this.rota.length(); i++) {
            char letra = this.rota.charAt(i);
            switch (letra) {
                case 'N' -> numN++;
                case 'S' -> numS++;
                case 'L' -> numL++;
                case 'O' -> numO++;
                case 'P' -> {
                    Ponto p = new Ponto(numL - numO, numN - numS);
                    pontos.add(p);
                }
                default -> {
                }
            }

        }
        return pontos;
        
    }
    
    

    
}
