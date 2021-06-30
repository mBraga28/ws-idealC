package exercício1.Serviços;

import exercício1.Entidades.Aluguel_de_carros;
import exercício1.Entidades.Fatura;

public class Serviço_de_aluguel {

    private Double preçoPorDia;
    private Double preçoPorHora;

    private Serviço_de_imposto serviçoDeImposto;

    public Serviço_de_aluguel(Double preçoPorDia, Double preçoPorHora, Serviço_de_imposto serviçoDeImposto) {
        this.preçoPorDia = preçoPorDia;
        this.preçoPorHora = preçoPorHora;
        this.serviçoDeImposto = serviçoDeImposto;
    }

    public void processamentoDeFatura(Aluguel_de_carros aluguelDeCarros) {
        long t1 = aluguelDeCarros.getComeço().getTime();
        long t2 = aluguelDeCarros.getTérmino().getTime();
        double horas = (double)(t2 - t1) / 1000 / 60 / 60;

        double pagamentoBásico;
        if (horas <= 12.0) {
            pagamentoBásico = preçoPorHora * Math.ceil(horas);
        }
        else {
            pagamentoBásico = preçoPorDia * Math.ceil(horas / 24);
        }

        double tax = serviçoDeImposto.imposto(pagamentoBásico);

        aluguelDeCarros.setFatura(new Fatura(pagamentoBásico, tax));
    }

}
