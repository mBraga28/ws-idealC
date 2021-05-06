package entidadesM14;
///////////////////// A3 /////////////////////////////
public abstract class ContaAbstract {
    private Integer numero;
    private String titular;
    protected Double saldo;
    /*      |
     *      |--> pode usar tb "protected Double saldo;" para ter acesso ao saldo na classe ContaDeNegocios
     */
    public ContaAbstract() {
    }

    public ContaAbstract(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }
    /*
     *	public void saque(double montante) {
     *		saldo -= montante;
     *	}
     */
    public void saque(double montante) {
        saldo -= montante + 5.0;
    }

    public void deposito(double montante) {
        saldo += montante;
    }

}

