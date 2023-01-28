package br.ufjf.dcc.dcc025.prova1questao1;

/**
 *
 * @author anna
 */
public class Ponto {
    
    private int x;
    private int y; 

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toSring(){
        
        return ("(" + this.x + "," + this.y + ")" );
    }
    
    
    
}
