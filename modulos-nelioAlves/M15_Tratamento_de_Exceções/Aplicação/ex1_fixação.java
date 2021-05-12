package Aplicação;

import EntidadesM15.Conta;
import Excessões.Excessões_de_Negócios;

import java.util.Locale;
import java.util.Scanner;

public class ex1_fixação {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados da conta");
        System.out.print("Número: ");
        int número = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Saque limte: ");
        double saqueLimite = sc.nextDouble();

        Conta conta = new Conta(número, titular, saldo, saqueLimite);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");
        double montante = sc.nextDouble();

        try {
            conta.saque(montante);
            System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
        }
        catch (Excessões_de_Negócios e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

