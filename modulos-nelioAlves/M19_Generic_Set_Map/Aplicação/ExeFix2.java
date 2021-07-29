package Aplicação;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExeFix2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos estudantes para o Curso A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer estudante = sc.nextInt();
            a.add(estudante);
        }

        System.out.print("Quantos estudantes para o Curso B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer estudante = sc.nextInt();
            b.add(estudante);
        }

        System.out.print("Quantos estudantes para o Curso C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Integer estudante = sc.nextInt();
            c.add(estudante);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de Estudantes: " + total.size());

        sc.close();
    }

}
