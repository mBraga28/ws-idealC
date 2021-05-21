package Xadrez;


import Jogo_de_Tabuleiro.Tabuleiro;
import Xadrez_peças.Rei;
import Xadrez_peças.Torre;

public class Partida_de_Xadrez {

    private static Tabuleiro tabuleiro;

    public Partida_de_Xadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        setupInicial();
    }

    public static Peça_de_Xadrez[][] getPeças() {
////////    |----> foi posto um static paar ler o getPeças()
        Peça_de_Xadrez[][] part = new Peça_de_Xadrez[tabuleiro.getFilas()][tabuleiro.getColunas()];
        for ( int i = 0; i< tabuleiro.getFilas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                part[i][j] = (Peça_de_Xadrez) tabuleiro.peça(i, j);

            }
        }
        return part;
    }

    private void  novo_lugar_das_peças(char coluna, int fila, Peça_de_Xadrez peça) {
        tabuleiro.lugar_da_peça(peça, new Peça_de_Xadrez().toPosição());
    }

    private void setupInicial() {
        novo_lugar_das_peças('b', 6,  new Torre(tabuleiro, Cor.BRANCO));
        novo_lugar_das_peças('e', 8,new Rei(tabuleiro, Cor.PRETO));
        novo_lugar_das_peças('e', 1,new Rei(tabuleiro, Cor.BRANCO));
    }
}
