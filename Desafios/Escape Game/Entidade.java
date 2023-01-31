public class Entidade {

    char simbolo;

    public Entidade(char tipoEntidade) {
        if (tipoEntidade == '\u0000') {
            this.simbolo = ' ';
        } else {
            this.simbolo = tipoEntidade;
        }
    }

    public char getSimbolo(boolean exibirSimbolosEscondidos) {
        if ((simbolo == 'B' || simbolo == 'S') && !exibirSimbolosEscondidos) {
            return ' ';
        } else {
            return this.simbolo;
        }
    }

}