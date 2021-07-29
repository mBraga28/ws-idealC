package exercício2.entidades;

public class Produto implements Comparable<Produto>{

    private String nome;
    private Double preço;

    public Produto(String nome, Double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", preço) ;
    }

    @Override
    public int compareTo(Produto outro) {
        return preço.compareTo(outro.getPreço());
    }
}
