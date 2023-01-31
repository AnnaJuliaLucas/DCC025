public class Comando {

    char direcao;
    int deslocamento;

    public Comando(char direcao, int deslocamento) throws ExcecaoDirecao, ExcecaoDeslocamento {
        direcao = Character.toLowerCase(direcao);
        if (direcao == 'e' || direcao == 'd' || direcao == 'b' || direcao == 'c') {
            if (deslocamento > 0) {
                this.direcao = direcao;
                this.deslocamento = deslocamento;
            } else {
                throw new ExcecaoDeslocamento();
            }
        } else {
            throw new ExcecaoDirecao();
        }
    }

    public char getDirecao() {
        return direcao;
    }

    public int getDeslocamento() {
        return deslocamento;
    }

    @Override
    public String toString() {
        return "(" + this.direcao + ", " + this.deslocamento + ")";
    }

}