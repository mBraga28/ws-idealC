package Aplicação;

import EntidadesM15.Reservas;
import Excessões.Excessões_de_Domínio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class a3_boa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int number = sc.nextInt();
            System.out.print("Data do check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data do check-out (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservas reservas = new Reservas(number, checkIn, checkOut);
            System.out.println("Reservas: " + reservas);

            System.out.println();
            System.out.println("Entre com a data da atualização da reserva:");
            System.out.print("Data do check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Data do check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservas.datasATT(checkIn, checkOut);
            System.out.println("Reservas: " + reservas);
        }
        catch (ParseException e) {
            System.out.println("Formato de data inválido");
        }
        catch (Excessões_de_Domínio e) {
            System.out.println("Erro em reservar: " + e.getMessage());
        }
        catch (RuntimeException e) {
/*              |
                |----> erro genérico
 */
            System.out.println("Erro inesperado");
        }

        sc.close();
    }
}
