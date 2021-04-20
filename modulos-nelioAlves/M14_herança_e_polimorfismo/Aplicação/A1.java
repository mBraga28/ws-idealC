package Aplicação;

import entidadesM14.Conta;
import entidadesM14.ContaDeNegocios;
import entidadesM14.ContaPoupanca;

public class A1 {
    public static void main(String[] args) {

        Conta con = new Conta(1001, "Bianca", 0.0);
        ContaDeNegocios bcon = new ContaDeNegocios(1002, "Marco Braga", 0.0, 500.0);


        //// UPCASTING
        Conta con1 = bcon;
        Conta con2 = new ContaDeNegocios(1003, "Isis", 0.0, 200.0);
        Conta con3 = new ContaPoupanca(1004, "Roberta", 0.0, 0.01);

        //// DOWNCASTING

        ContaDeNegocios con4 = (ContaDeNegocios)con2;
        con4.emprestimo(100.0);

        ////ContaDeNegocios con5 = (ContaDeNegocios)con3;
        if (con3 instanceof ContaDeNegocios) {
            ContaDeNegocios con5 = (ContaDeNegocios)con3;
            con5.emprestimo(200.0);
            System.out.println("Emprestado!");
        }

        if (con3 instanceof ContaPoupanca) {
            ContaPoupanca con5 = (ContaPoupanca)con3;
            con5.attSaldo();
            System.out.println("Atualizou!");
        }






    }
}