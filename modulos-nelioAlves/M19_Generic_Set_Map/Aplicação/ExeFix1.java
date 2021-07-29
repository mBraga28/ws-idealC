package Aplicação;

import exercícioFixação1.entidades.Entrada_de_Registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExeFix1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o caminho completo do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            Set<Entrada_de_Registro> set = new HashSet<>();

            String linha = br.readLine();
            while (linha != null) {

                String[] campos = linha.split(" ");
                String usuario = campos[0];
                Date momento = Date.from(Instant.parse(campos[1]));

                set.add(new Entrada_de_Registro(usuario, momento));

                linha = br.readLine();
            }
            System.out.println("Total de Usuários: " + set.size());

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
