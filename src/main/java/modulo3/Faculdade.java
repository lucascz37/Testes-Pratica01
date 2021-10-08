package modulo3;

import modulo1.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

public class Faculdade {

    private String nome;

    private double arrecadado;

    private List<Pessoa> pessoas;

    private ListaBiblioteca bibliotecas;

    public Faculdade(){

    }

    public Faculdade(String nome, double arrecadado, List<Pessoa> pessoas, ListaBiblioteca bibliotecas) {
        this.nome = nome;
        this.arrecadado = arrecadado;
        this.pessoas = pessoas;
        this.bibliotecas = bibliotecas;
    }

    public void addReceita(double valor){
        arrecadado += valor;
    }

    public List<Pessoa> procurarPessoaPorNome(String nome){
        return pessoas.stream().filter(p -> p.getNome().equals(nome)).collect(Collectors.toList());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArrecadado() {
        return arrecadado;
    }

    public void setArrecadado(double arrecadado) {
        this.arrecadado = arrecadado;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public ListaBiblioteca getBibliotecas() {
        return bibliotecas;
    }

    public void setBibliotecas(ListaBiblioteca bibliotecas) {
        this.bibliotecas = bibliotecas;
    }

    @Override
    public String toString() {
        return "Faculdade{" +
                "nome='" + nome + '\'' +
                ", arrecadado=" + arrecadado +
                ", pessoas=" + pessoas +
                ", bibliotecas=" + bibliotecas +
                '}';
    }
}
