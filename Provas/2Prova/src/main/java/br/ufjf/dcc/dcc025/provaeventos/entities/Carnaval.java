package br.ufjf.dcc.dcc025.provaeventos.entities;

/**
 *
 * @author ice
 */
public class Carnaval extends Evento {
   
    
    public Carnaval(double valor, Data data, String nome, int capacidade) {
        super(valor, data, nome, capacidade);
    }
    
    @Override
    public boolean pessoaPodeParticipar(Pessoa pessoa) {
        int idade = pessoa.getDataNascimento().diferenca(getData()) / 365;
        return idade >= 18 && temVaga();
    }
}