package exercício5.entidades;

public class Funcionários implements Comparable<Funcionários>{

    private String nome;
    private Double salário;

    public Funcionários(String nome, Double salário) {
        this.nome = nome;
        this.salário = salário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalário() {
        return salário;
    }

    public void setSalário(Double salário) {
        this.salário = salário;
    }

    @Override
    public int compareTo(Funcionários outro) {
        return nome.compareTo(outro.getNome());
    }

    /*

    //////////// Listagem em ordem crescente do salário /////////////
    @Override
    public int compareTo(Funcionários outro) {
        return salário.compareTo(outro.getSalário()());
    }

    //////////// Listagem em ordem decrescente do salário /////////////
    @Override
    public int compareTo(Funcionários outro) {
        return -salário.compareTo(outro.getSalário()());
    }

     */
}
