package entidadesM14;

public class FuncionariosTerceirizados  extends Funcionarios {

    private Double despesaAdicional;

    public FuncionariosTerceirizados() {
        super();
    }

    public FuncionariosTerceirizados(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
    @Override
    public Double pagamento() {
        return super.pagamento() + despesaAdicional * 1.1;
    }
}
