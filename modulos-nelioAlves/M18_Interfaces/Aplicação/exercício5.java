package Aplicação;

import exercício5.entidades.Funcionários;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class exercício5 {

    public static void main(String[] args) {
        List<Funcionários> lista = new ArrayList<>();

        String caminho = "C:\\Users\\marco\\IdeaProjects\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String funcionárioCsv = br.readLine();
            while (funcionárioCsv != null) {
                String[] campos = funcionárioCsv.split(",");
                lista.add(new Funcionários(campos[0], Double.parseDouble(campos[1])));
                funcionárioCsv = br.readLine();
            }
            Collections.sort(lista);
            for (Funcionários f : lista) {
                System.out.println(f.getNome() + "," + f.getSalário());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
