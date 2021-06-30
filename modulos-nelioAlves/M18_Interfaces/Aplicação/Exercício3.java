package Aplicação;

import exercício3.entidades.Círculo;
import exercício3.entidades.FormaAbstract;
import exercício3.EnumM18.Cor;
import exercício3.entidades.Retângulo;

public class Exercício3 {
    public static void main(String[] args) {

        FormaAbstract f1 = new Círculo(Cor.PRETO, 2.0);
        FormaAbstract f2 = new Retângulo(Cor.BRANCO, 3.0, 4.0);

        System.out.println("Cor do círculo: " + f1.getCor());
        System.out.println("Área do círculo: " + String.format("%.3f",f1.área()));
        System.out.println("Cor do retângulo: " + f2.getCor());
        System.out.println("Área do retângulo: " + String.format("%.3f",f1.área()));

    }
}
