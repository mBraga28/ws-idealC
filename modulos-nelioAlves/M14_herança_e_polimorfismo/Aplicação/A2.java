package Aplicação;

import entidadesM14.Conta;
import entidadesM14.ContaDeNegocios;
import entidadesM14.ContaPoupanca;

public class A2 {
    public static void main(String[] args) {

        Conta con1 = new Conta(1001, "Ana", 1000.0);
        con1.saque(200.0);
        System.out.println(con1.getSaldo());

        Conta con2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
        con2.saque(200.0);
        System.out.println(con2.getSaldo());

        Conta con3 = new ContaDeNegocios(1003, "Bruno", 1000.0, 500.0);
        con3.saque(200.0);
        System.out.println(con3.getSaldo());

    }
}
