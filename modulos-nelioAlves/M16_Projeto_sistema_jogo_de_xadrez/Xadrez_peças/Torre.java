package Xadrez_peças;

import Jogo_de_Tabuleiro.Tabuleiro;
import Xadrez.Cor;
import Xadrez.Peça_de_Xadrez;

public class Torre extends Peça_de_Xadrez {


    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "T";
    }
}
