package entidadesM14;

public class Produto {

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

    public String etiquetaDePreço() {
        return nome
                + " $ "
                + String.format("%.2f", preço);
    }


}
