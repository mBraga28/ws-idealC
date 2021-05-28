package Aplicação;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula4 {

    public static void main(String[] args) {
        String[] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        String caminho = "C:\\Users\\marco\\IdeaProjects\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
/*                                                                      |          |----> "...(new FileWriter(caminho, true))) serve para recriar um arquivo novo
                                                                        |----> sem o true podemos criar ou recriar um arquivo
*/
            for (String linha : linhas) {
                bw.write(linha);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
