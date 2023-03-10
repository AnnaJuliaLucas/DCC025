import java.util.List;

public class OrdenadorIdade extends Ordenador {

    @Override
    public void ordena(List<Pessoa> listaPessoas) {
        for (int i = 0; i < listaPessoas.size() - 1; i++) {
            Pessoa pessoa1 = listaPessoas.get(i);
            Pessoa pessoa2 = listaPessoas.get(i + 1);

            if (this.compara(pessoa1, pessoa2) > 0) {
                int idadePessoa1 = pessoa1.getIdade();
                String nomePessoa1 = pessoa1.getNome();

                pessoa1.setIdade(pessoa2.getIdade());
                pessoa1.setNome(pessoa2.getNome());

                pessoa2.setIdade(idadePessoa1);
                pessoa2.setNome(nomePessoa1);
            }
        }
    }

    @Override
    protected int compara(Pessoa pessoa1, Pessoa pessoa2) {
        if (pessoa1.getIdade() < pessoa2.getIdade()) {
            return -1;
        } else if (pessoa2.getIdade() < pessoa1.getIdade()) {
            return 1;
        } else {
            return 0;
        }
    }
}