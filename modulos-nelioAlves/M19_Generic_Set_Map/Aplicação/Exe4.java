package Aplicação;

import exercício4.entidades.Círculo;
import exercício4.entidades.Forma;
import exercício4.entidades.Retângulo;

import java.util.ArrayList;
import java.util.List;

public class Exe4 {
    public static void main(String[] args) {

        List<Forma> minhasFormas = new ArrayList<>();
        minhasFormas.add(new Retângulo(3.0, 2.0));
        minhasFormas.add(new Círculo(2.0));

        List<Círculo> meusCírculos = new ArrayList<>();
        meusCírculos.add(new Círculo(3.0));
        meusCírculos.add(new Círculo(2.0));

        System.out.println("Área total das formas: " + áreaTotal(minhasFormas));
        System.out.println("Área total dos círculos: " + áreaTotal(meusCírculos));

    }
    /*|--------> maneira de utlizar outras classes do tipo forma
      |
      |---------------------------------|                                          */
    public static double áreaTotal(List<? extends Forma> lista) {
        double soma = 0.0;
        for (Forma s : lista) {
            soma += s.área();
        }
        return soma;
    }
}
