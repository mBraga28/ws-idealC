package exercício4.entidades;

public class Círculo implements Forma {

    private Double raio;

    public Círculo(){
        super();
    }

    public Círculo(Double raio) {
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
