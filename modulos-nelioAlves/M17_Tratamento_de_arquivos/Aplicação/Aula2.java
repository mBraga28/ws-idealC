package Aplicação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula2 {
    public static void main(String[] args) {

        String pasta = "C:\\Users\\marco\\IdeaProjects\\int.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(pasta);
            br = new BufferedReader(fr);

            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            try{
               if(br != null) {
                br.close();
               }
               if (fr != null) {
                   fr.close();
               }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
