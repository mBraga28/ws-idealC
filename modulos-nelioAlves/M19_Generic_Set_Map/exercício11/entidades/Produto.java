package exercício11.entidades;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return getNome().equals(produto.getNome()) && getPreço().equals(produto.getPreço());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreço());
    }

    @Override
    public String toString() {
        return "Produto{" + "nome='" + nome + '\'' + ", preço=" + preço + '}';
    }

    @Override
    public int compareTo(Produto o) {
        return nome.toUpperCase().compareTo(o.getNome().toUpperCase());
    }
}
