package Jogo_de_Tabuleiro;

public class Posição {
    private int fila;
    private int coluna;

    public Posição(int fila, int coluna) {
        this.fila = fila;
        this.coluna = coluna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return fila + ", " + coluna;
    }
}
