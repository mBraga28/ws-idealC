package Aplicação;

import java.io.File;
import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um caminho do arquivo: ");
        String strCaminho = sc.nextLine();

        File caminho = new File(strCaminho);

        System.out.println("getNome: " + caminho.getName());
        System.out.println("getParent(O 'Pai'): " + caminho.getParent());
        System.out.println("getPath(Caminho): " + caminho.getPath());

        sc.close();
    }
}
