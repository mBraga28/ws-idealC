/*
   Fazer um programa para ler o caminho de um arquivo .csv
   contendo os dados de itens vendidos. Cada item possui um
   nome, preço unitário e quantidade, separados por vírgula. Você
   deve gerar um novo arquivo chamado "sumário.csv", localizado
   em uma subpasta chamada "out" a partir da pasta original do
   arquivo de origem, contendo apenas o nome e o valor total para
   aquele item (preço unitário multiplicado pela quantidade),
   conforme exemplo.
 */

package Aplicação;

import entidades.Produto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercício_de_Fixação {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> lista = new ArrayList<>();

        System.out.println("Insira o caminho do arquivo: ");
        String arquivoFonteStr = sc.nextLine();

        File arquivoFonte = new File(arquivoFonteStr);
        String pastaFonteStr = sc.nextLine();

        boolean sucesso = new File(pastaFonteStr + "\\out").mkdir();

        String arquivoAlvoStr = arquivoFonteStr + "\\out\\sumário.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoFonteStr))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] campos = itemCsv.split(",");
                String nome = campos[0];
                double preço = Double.parseDouble(campos[1]);
                int quantidade = Integer.parseInt(campos[2]);

                lista.add(new Produto(nome, preço, quantidade));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoAlvoStr))) {

                for ( Produto item : lista ) {
                bw.write(item.getNome() + "," + String.format("%.2f", item.getPreço()));
                bw.newLine();
            }

                System.out.println(arquivoAlvoStr + "CRIADO!");

            } catch (IOException e) {
                System.out.println("Erro ao escrever o arquivo: " + e.getMessage());

            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        sc.close();
    }
}
