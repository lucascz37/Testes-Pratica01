package modulo4;

public class Livro {

    private String codigo;
    private String nome;
    private String autor;
    private double valor;

    public Livro() {
    }

    public Livro(String codigo, String nome, String autor, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean verificaValorLivro(){
        if(this.valor > 0){
            return true;
        }else {
            return false;
        }
    }
}
