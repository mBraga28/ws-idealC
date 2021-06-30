package exercício3.entidades;

import exercício3.EnumM18.Cor;


public class Círculo extends FormaAbstract {

    private Double raio;

    public Círculo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double área() {
        return Math.PI * raio * raio;
    }
}
