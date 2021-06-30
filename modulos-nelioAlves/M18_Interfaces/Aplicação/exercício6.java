package Aplicação;

import exercício6.Serviços.Serviço_de_Prestação_no_Brasil;
import exercício6.Serviços.Serviço_de_Prestação_no_EUA;

import java.util.Locale;
import java.util.Scanner;

public class exercício6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Montante: ");
        double montante = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        Serviço_de_Prestação spbr = new Serviço_de_Prestação_no_EUA(1.0);
        double pagamento = spbr.pagamento(montante, meses);

        System.out.println("Pagamento depois de " + meses + " meses: ");
        System.out.println(String.format("%.2f", pagamento));

        sc.close();
    }
}
