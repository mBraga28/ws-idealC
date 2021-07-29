package Aplicação;

import exercício2.entidades.Produto;
import exercício2.serviços.Serviço_Calculação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exe2 {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        String caminho = "C:\\Users\\marco\\IdeaProjects\\lista_de_produtos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] campos = linha.split(",");
                lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
                linha = br.readLine();
            }

            Produto x = Serviço_Calculação.max(lista);
            System.out.println("Max:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
