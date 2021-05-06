package Aplicação;

import entidadesM14.Contribuintes;
import entidadesM14.PessoaFísica;
import entidadesM14.PessoaJurídica;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> lista = new ArrayList<>();

        System.out.println("Entre com o número de contribuintes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Dados do Contribuinte #" + i + ": ");
            System.out.print("Pessoa Física ou Pessoa Jurídica (f/j)?");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double rendaAnual = sc.nextDouble();
            if (ch == 'f') {
                System.out.print("Gastos com Saúde: ");
                double gastos_com_saúde = sc.nextDouble();
                lista.add(new PessoaFísica(nome, rendaAnual, gastos_com_saúde));
            }
            else {
                System.out.print("Número de Funcionários: ");
                int número_de_funcionários = sc.nextInt();
                lista.add(new PessoaJurídica(nome, rendaAnual, número_de_funcionários));
            }

        }
        double soma = 0.0;
        System.out.println();
        System.out.println("IMPOSTOS PAGOS: ");

        for (Contribuintes cont : lista) {
            double imposto = cont.imposto();
            System.out.println(cont.getNome() + ": R$ " + String.format("%.2f", imposto));
            soma += imposto;
        }
        System.out.println();
        System.out.println("SOMA TOTAL DE IMPOSTOS: R$ " + String.format("%.2f", soma));

        sc.close();
    }
}
