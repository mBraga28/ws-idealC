package exercício1.Entidades;

import java.util.Date;

public class Aluguel_de_carros {

    private Date começo;
    private Date término;

    private Veículo veículo;
    private Fatura fatura;

    public Aluguel_de_carros() {
    }

    public Aluguel_de_carros(Date começo, Date término, Veículo veículo) {
        this.começo = começo;
        this.término = término;
        this.veículo = veículo;
    }

    public Date getComeço() {
        return começo;
    }

    public void setComeço(Date começo) {
        this.começo = começo;
    }

    public Date getTérmino() {
        return término;
    }

    public void setTérmino(Date término) {
        this.término = término;
    }

    public Veículo getVeículo() {
        return veículo;
    }

    public void setVeículo(Veículo veículo) {
        this.veículo = veículo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

}
