package br.ufjf.dcc.dcc025.provaeventos.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public abstract class Evento {

    private double valor;
    private Data data;
    private String nome;
    private int capacidade;
    private List<Pessoa> participantes;

    public Evento(double valor, Data data, String nome, int capacidade) {
        this.valor = valor;
        this.data = data;
        this.nome = nome;
        this.capacidade = capacidade;
        this.participantes = new ArrayList<Pessoa>();
    }

    public Evento() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean temVaga() {
        return participantes.size() < capacidade;
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }

    public abstract boolean pessoaPodeParticipar(Pessoa pessoa);

    public void adicionaPessoa(Pessoa pessoa) {
        if (pessoaPodeParticipar(pessoa)) {
            participantes.add(pessoa);
        }
    }

}
