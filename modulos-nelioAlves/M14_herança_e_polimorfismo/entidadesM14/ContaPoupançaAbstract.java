package entidadesM14;

public class ContaPoupançaAbstract extends ContaAbstract {
/*    |
      |-----> "public final class..." é utilizado quando não quiser que seja sobreposto e tb evitando que tenha uma super classe
*/
    private Double taxaDeJuros;

    public ContaPoupançaAbstract() {
        super();
    }

    public ContaPoupançaAbstract(Integer numero, String titular, Double saldo,Double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    public void attSaldo() {
        saldo += saldo * taxaDeJuros;
    }
    @Override
    public void saque(double montante) {
        saldo -= montante;
    }
/*      |
        |--> "public final void..." é utilizado quando não quiser q seja sobreposto e tb evitando q tenha em uma super classe

 */
}

