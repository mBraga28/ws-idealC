package Xadrez;

import Jogo_de_Tabuleiro.Peça;
import Jogo_de_Tabuleiro.Tabuleiro;

public class Peça_de_Xadrez extends Peça {

    private Cor cor;

    public Peça_de_Xadrez(Tabuleiro tabuleiro, Cor cor) {
  /*                      |                     |-----> alterou de Cor para int
                          |-----> alterou de Tabuleiro para char
*/
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
