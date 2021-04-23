package Aplicação;

import entidadesM14.Produto;
import entidadesM14.Produto_Importado;
import entidadesM14.Produto_Usado;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


/////////////////////Exercício de Fixação //////////////////////////
public class EX2 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> lista = new ArrayList<>();

        System.out.print("Entrar com o número de produtos: ");
        int n = sc.nextInt();
        for (int k=1; k<=n; k++) {
            System.out.println("Dados do Produto #" + k + ":");
            System.out.print("Comum, usado ou importado(c/u/i)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preço = sc.nextDouble();
            if (tipo == 'c') {
                lista.add(new Produto(nome, preço));
            }
            else if (tipo == 'u') {
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                lista.add(new Produto_Usado(nome, preço, data));
            }
            else {
                System.out.print("Taxa Alfandegária: ");
                double taxaAlfandegária = sc.nextDouble();
                lista.add(new Produto_Importado(nome, preço, taxaAlfandegária));
            }
        }
        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");
        for (Produto prod : lista) {
            System.out.println(prod.etiquetaDePreço());
        }

        sc.close();
    }

}
