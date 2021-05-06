package Aplicação;

import entidadesM14.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public  class A3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<ContaAbstract> lista = new ArrayList<>();

        lista.add(new ContaPoupançaAbstract(1001, "Ana", 500.0, 0.01));
        lista.add(new ContaDeNegóciosAbstract(1002, "Maria", 1000.0, 400.0));
        lista.add(new ContaPoupançaAbstract(1004, "Roberto", 300.0, 0.01));
        lista.add(new ContaDeNegóciosAbstract(1005, "João", 500.0, 500.0));

        double soma = 0.0;
        for (ContaAbstract cont : lista) {
            soma += cont.getSaldo();
        }

        System.out.printf("Saldo total: R$ %.2f%n",soma);

        for (ContaAbstract cont : lista) {
            cont.deposito(10.0);
        }
        for ( ContaAbstract cont : lista) {

            System.out.printf("Atualização da Conta %d: %.2f%n",cont.getNumero(), cont.getSaldo());
        }




    }
}
