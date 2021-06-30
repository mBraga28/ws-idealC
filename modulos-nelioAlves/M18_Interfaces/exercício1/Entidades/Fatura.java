package exercício1.Entidades;

public class Fatura {

    private Double pagamentoBásico;
    private Double imposto;

    public Fatura() {
    }

    public Fatura(Double pagamentoBásico, Double tax) {
        this.pagamentoBásico = pagamentoBásico;
        this.imposto = tax;
    }

    public Double getPagamentoBásico() {
        return pagamentoBásico;
    }

    public void setPagamentoBásico(Double pagamentoBásico) {
        this.pagamentoBásico = pagamentoBásico;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getTotalDePagamento() {
        return getPagamentoBásico() + getImposto();
    }

}
