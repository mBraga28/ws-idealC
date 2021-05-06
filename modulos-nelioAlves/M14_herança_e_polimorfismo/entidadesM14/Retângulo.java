package entidadesM14;

import entidadesEnumM14.Cor;

public class Retângulo extends Forma {

    private Double largura;
    private Double altura;

    public Retângulo() {
        super();
    }

    public Retângulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double área() {
        return largura * altura;
    }
}
