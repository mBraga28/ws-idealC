package Aplicação;

import exercício2.Entidades.Contrato;
import exercício2.Entidades.Prestação;
import exercício2.Serviços.Serviço_de_contrato;
import exercício2.Serviços.Serviço_de_paypal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercício2 {
    public static void main ( String[] args ) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrar Dados do Contrato:");
        System.out.print("Número: ");
        Integer número = sc.nextInt();
        System.out.print("Data (dd/MM/aaaa): ");
        Date data = sdf.parse(sc.next());
        System.out.print("Valor do Contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(número, data, valorTotal);

        System.out.print("Insira o número de Prestrações: ");

        int n = sc.nextInt();

        Serviço_de_contrato serviço_de_contrato = new Serviço_de_contrato(new Serviço_de_paypal());

        serviço_de_contrato.processo_de_contrato(contrato, n);

        System.out.println("Prestações: ");
        for (Prestação x : contrato.getPrestações()) {
            System.out.println(x);
        }

        sc.close();
    }
}
