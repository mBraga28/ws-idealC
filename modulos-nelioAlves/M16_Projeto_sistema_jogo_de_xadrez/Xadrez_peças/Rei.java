package Xadrez_peças;

import Jogo_de_Tabuleiro.Tabuleiro;
import Xadrez.Cor;
import Xadrez.Peça_de_Xadrez;

public class Rei extends Peça_de_Xadrez {

    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
