package Aplicação;

import java.io.File;
import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira um caminho da pasta: ");
    String strCaminho = sc.nextLine();

    File caminho = new File(strCaminho);

    File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }
        File[] arqs = caminho.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File arq : arqs) {
            System.out.println(arq);
        }

        boolean sucesso = new File(strCaminho + "\\subdir").mkdir();
        System.out.println("Diretório criado com sucesso: " + sucesso);

    sc.close();
    }
}
