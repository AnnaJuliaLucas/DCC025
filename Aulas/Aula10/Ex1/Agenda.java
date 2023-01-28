import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author devgabmal
 */
public class Agenda {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        listaPessoas.add(new Pessoa("Maria", 28));
        listaPessoas.add(new Pessoa("João", 15));
        listaPessoas.add(new Pessoa("Maria", 15));
        listaPessoas.add(new Pessoa("Pedro", 87));
        
        OrdenadorIdade ordenadorIdade = new OrdenadorIdade();
        ordenadorIdade.ordena(listaPessoas);

        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }
}