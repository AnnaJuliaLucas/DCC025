public class Posicao {

    Entidade entidade;

    public Posicao(char tipoEntidade) {
        this.entidade = new Entidade(tipoEntidade);
    }

    public char getSimbolo(boolean exibirSimbolosEscondidos) {
        return this.entidade.getSimbolo(exibirSimbolosEscondidos);
    }

}