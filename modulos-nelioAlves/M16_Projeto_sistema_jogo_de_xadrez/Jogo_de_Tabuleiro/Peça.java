package Jogo_de_Tabuleiro;

public class Peça {

    protected Posição posição;
    private Tabuleiro tabuleiro;

    public Peça(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
