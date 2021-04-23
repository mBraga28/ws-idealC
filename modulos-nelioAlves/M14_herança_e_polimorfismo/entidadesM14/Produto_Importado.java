package entidadesM14;

public class Produto_Importado extends Produto{

    private Double taxaAlfandegária;

    public Produto_Importado(String nome, Double preço, Double taxaAlfandegária) {
        super(nome, preço);
        this.taxaAlfandegária = taxaAlfandegária;
    }

    public Double getTaxaAlfandegária() {
        return taxaAlfandegária;
    }

    public void setTaxaAlfandegária(Double taxaAlfandegária) {
        this.taxaAlfandegária = taxaAlfandegária;
    }

    public Double preçoTotal() {
        return getPreço() + taxaAlfandegária;
    }

    @Override
    public String etiquetaDePreço() {
        return getNome()
                        + "$ "
                        + String.format("%.2f", preçoTotal())
                        + " (Taxa Alfandegária: "
                        + String.format("%.2f", taxaAlfandegária)
                        + ")";
    }
}
