package Aplicação;

import Jogo_de_Tabuleiro.Posição;
import Jogo_de_Tabuleiro.Tabuleiro;
import Xadrez.Partida_de_Xadrez;


public class Programa_Principal {
    public static void main(String[] args) {

        Partida_de_Xadrez part = new Partida_de_Xadrez();

/*        Posição pos = new Posição(3, 5);
          Tabuleiro tabuleiro = new Tabuleiro(8, 8);


          System.out.println(pos);
          System.out.println(tabuleiro);
*/
          UI.printTabuleiro(Partida_de_Xadrez.getPeças());

    }
}
