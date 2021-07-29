package Aplicação;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercícioFix3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votos = new LinkedHashMap<>();

        System.out.print("Insira o caminho completo do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha = br.readLine();
            while (linha != null){
                String[] campos = linha.split(",");
                String nome = campos[0];
                int contagem = Integer.parseInt(campos[1]);

                if (votos.containsKey(nome)) {
                     int votos_de_tão_longe = votos.get(nome);
                     votos.put(nome, contagem + votos_de_tão_longe);
                }
                else {
                     votos.put(nome, contagem);
                }

                linha = br.readLine();
            }

            for (String chave : votos.keySet()) {
                System.out.println(chave + ": " + votos.get(chave));
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
