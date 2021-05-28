package Aplicação;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {

        File arq = new File("C:\\Users\\marco\\IdeaProjects\\int.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(arq);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
