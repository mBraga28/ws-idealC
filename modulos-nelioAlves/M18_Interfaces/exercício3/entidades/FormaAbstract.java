package exercício3.entidades;

import exercício3.EnumM18.Cor;

public abstract class FormaAbstract implements Forma {
    private Cor cor;

    public FormaAbstract() {
    }

    public FormaAbstract(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

}