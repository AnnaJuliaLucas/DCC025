package br.ufjf.dcc.dcc025.provaeventos.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Pessoa {
    private Data dataNascimento;
    private String nome;
    private List<Evento> eventos;
    
    public Pessoa(Data dataNascimento, String nome) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.eventos = new ArrayList<Evento>();
    }
    
    public Pessoa() {
    }
    
    public Data getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public boolean podeParticiparEvento(Evento evento) {
        for (Evento e : eventos) {
            if (e.getData().diferenca(evento.getData()) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void agendarEvento(Evento evento) {
        if (podeParticiparEvento(evento)) {
            eventos.add(evento);
        }
    }
}



