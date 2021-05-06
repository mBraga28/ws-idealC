package entidadesM14;

public class ContaDeNegóciosAbstract extends ContaAbstract {

    private Double limiteDeEmprestimo;

    public ContaDeNegóciosAbstract() {
        super();
    }

    public ContaDeNegóciosAbstract(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
        super(numero, titular, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public Double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public void emprestimo(double montante) {
        if (montante <= limiteDeEmprestimo) {
            deposito(montante);
/*          |
            |---> caso eu quisesse substitui-lo por "saldo += montante -10."
                  só poderia liberar a informação se usasse o 'protected' no
                  lugar do 'private' em "Conta".
 */
        }
    }
    @Override
    public void saque(double montante) {
        super.saque(montante);
        saldo -= 2.0;
    }
}

