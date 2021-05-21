package Jogo_de_Tabuleiro;

public class Tabuleiro {

    private int filas;
    private int colunas;
    private Peça[][] peças;

    public Tabuleiro(int filas, int colunas) {
        if (filas < 1 || colunas < 1){
            throw new Excessão_do_tabuleiro("Erro na criação do tabuleiro: ");
        }
        this.filas = filas;
        this.colunas = colunas;
        peças = new Peça[filas][colunas];
    }

    public int getFilas() {
        return filas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peça peça(int fila, int coluna) {
        if (!posiçãoExistente(fila, coluna)) {
            throw new Excessão_do_tabuleiro("Posição não está no tabuleiro!!!");
        }
        return peças[fila][coluna];
    }

    public Peça peça(Posição posição) {
        if (!posiçãoExistente(posição)) {
            throw new Excessão_do_tabuleiro("Posição não está no tabuleiro!!!");
        }
        return peças[posição.getFila()][posição.getColuna()];
    }

    public void lugar_da_peça(Peça peça, Posição posição) {
        if (aquiTemUmaPeça(posição)) {
            throw new Excessão_do_tabuleiro("Já existe uma peça na posição " + posição);
        }
        peças[posição.getFila()][posição.getColuna()] = peça;
        peça.posição = posição;
    }

    private boolean posiçãoExistente(int fila, int coluna) {
         return fila >= 0 && fila < filas && coluna >= 0 && coluna < colunas;
    }

    public boolean posiçãoExistente(Posição posição) {
        return posiçãoExistente(posição.getFila(), posição.getColuna());
    }

    public boolean aquiTemUmaPeça(Posição posição){
        if (!posiçãoExistente(posição)) {
            throw new Excessão_do_tabuleiro("Posição não está no tabuleiro!!!");
        }
      return peça(posição) != null;
    }
}
