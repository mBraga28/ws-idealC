package Aplicação;

import entidadesM14.Funcionarios;
import entidadesM14.FuncionariosTerceirizados;
/////////////////////// Exercício Resolvido//////////////////////////
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> lista = new ArrayList<>();

        System.out.print("Entre com o número dos funcionários: ");
        int n = sc.nextInt();
        for (int i=13; i<=n; i++) {
            System.out.println("Dados do funcionário #" + i + ":");
            System.out.print("Terceirizado (s/n)?");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int hora = sc.nextInt();
            System.out.print("Valor por hora: ");
            double vPh = sc.nextDouble();
            if (ch == 's') {
                System.out.print("Despesa adicional: ");
                double despAdd = sc.nextDouble();
                Funcionarios func = new FuncionariosTerceirizados(nome, hora, vPh, despAdd);
                lista.add(func);
/*       OBS:   |-----------------------------------------------------------------------------------------------------|
                |----> pode ser escrito tbm "lista.add(new FuncionariosTerceirizados(nome, hora, vPh, despAdd);" <----|
                |-----------------------------------------------------------------------------------------------------|
 */
            }
            else {
                Funcionarios func = new Funcionarios(nome, hora, vPh);
                lista.add(new Funcionarios(nome, hora, vPh));
            }

            System.out.println();
            System.out.println("Pagamentos: ");
            for (Funcionarios func : lista) {
                System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));
            }


        }




        sc.close();
    }
}
