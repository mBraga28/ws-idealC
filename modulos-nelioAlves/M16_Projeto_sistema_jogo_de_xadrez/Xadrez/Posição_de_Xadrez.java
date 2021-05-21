package Xadrez;


import Jogo_de_Tabuleiro.Posição;

public class Posição_de_Xadrez {

    private char coluna;
    private int fila;

    public Posição_de_Xadrez(char coluna, int fila) {
        if (coluna < 'a' || coluna > 'h' || fila < 1 || fila > 8) {
            throw new Excessão_de_Xadrez("Erro na instanciando Posição_de_Xadrez. Valores válidos são de a1 até h8 ");
        }
        this.coluna = coluna;
        this.fila = fila;
    }

    public char getColuna() {
        return coluna;
    }

    public int getFila() {
        return fila;
    }

    protected Posição toPosição() {
        return new Posição(8 - fila, coluna - 'a');
    }

    protected static Posição_de_Xadrez dePosição(Posição posição) {
        return new Posição_de_Xadrez((char)('a' - posição.getColuna()), 8 - posição.getFila());
    }

    @Override
    public String toString() {
        return "" + coluna + fila;
    }
}
