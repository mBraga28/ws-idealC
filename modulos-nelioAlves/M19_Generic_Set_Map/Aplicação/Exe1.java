package Aplicação;

import exercício1.serviços.Serviços_de_impressora;

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Serviços_de_impressora<Integer> si = new Serviços_de_impressora<>();

        System.out.print("Quantos valores? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer valor = sc.nextInt();
            si.addValue(valor);
        }

        si.imprimir();
        Integer x = si.primeiro();
        System.out.println("Primeiro: " + x);

        sc.close();
    }
}
