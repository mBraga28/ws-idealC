package Aplicação;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        File arq = new File("C:\\temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(arq);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
