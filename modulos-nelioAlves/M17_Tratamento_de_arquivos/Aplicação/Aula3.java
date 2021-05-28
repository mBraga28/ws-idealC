package Aplicação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula3 {
    public static void main(String[] args) {

        String caminho = "C:\\Users\\marco\\IdeaProjects\\int.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }
}

