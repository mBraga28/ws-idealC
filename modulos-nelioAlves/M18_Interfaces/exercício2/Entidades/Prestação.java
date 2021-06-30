package exercício2.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestação {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date data_de_vencimento;
    private Double montante;

    public Prestação (Date data_de_vencimento, Double montante) {

        this.data_de_vencimento = data_de_vencimento;
        this.montante = montante;
    }
    public Date getData_de_vencimento() {
        return data_de_vencimento;
    }

    public void setData_de_vencimento(Date data_de_vencimento) {
        this.data_de_vencimento = data_de_vencimento;
    }

    public Double getMontante() {
        return montante;
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }

    @Override
    public String toString() {
        return sdf.format(data_de_vencimento) + " - " + String.format("%.2f", montante);
    }


}
