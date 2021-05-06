package entidadesM14;

import entidadesEnumM14.Cor;

public class Círculo extends Forma {

    private Double raio;

    public Círculo(){
        super();
    }

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
