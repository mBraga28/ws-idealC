package entidadesM14;

public class PessoaFísica extends Contribuintes {

    private double gastos_com_saúde;

    public PessoaFísica(String nome, Double rendaAnual, double gastos_com_saúde) {
        super(nome, rendaAnual);
        this.gastos_com_saúde = gastos_com_saúde;
    }

    public double getGastos_com_saúde() {
        return gastos_com_saúde;
    }

    public void setGastos_com_saúde(double gastos_com_saúde) {
        this.gastos_com_saúde = gastos_com_saúde;
    }

    @Override
    public Double imposto() {
            if (getRendaAnual() < 20000.0) {
                return getRendaAnual() * 0.15 - getGastos_com_saúde() * 0.50;
            }
            else {
                return getRendaAnual() * 0.25 - getGastos_com_saúde() * 0.50;
            }
    }
}
