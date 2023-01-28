import java.util.List;

public abstract class Ordenador {

    public abstract void ordena(List<Pessoa> listaPessoas);

    private void troca(Pessoa pessoa1, Pessoa pessoa2) {

    }

    protected abstract int compara(Pessoa pessoa1, Pessoa pessoa2);
}