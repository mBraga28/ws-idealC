package Aplicação;

import exercício1.Entidades.Aluguel_de_carros;
import exercício1.Entidades.Veículo;
import exercício1.Serviços.Serviço_de_aluguel;
import exercício1.Serviços.Serviço_de_imposto_no_Brasil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Insira a data do aluguel: ");
        System.out.print("Modelo  do carro: ");
        String modeloCarro = sc.nextLine();
        System.out.print("Retirada (dd/MM/aaaa HH:mm): ");
        Date começo = sdf.parse(sc.nextLine());
        System.out.print("Entrega (dd/MM/aaaa HH:mm): ");
        Date término = sdf.parse(sc.nextLine());

        Aluguel_de_carros adc = new Aluguel_de_carros(começo, término, new Veículo(modeloCarro));

        System.out.print("Insira o preço por hora(R$): ");
        double preçoPorHora = sc.nextDouble();
        System.out.print("Insira o preço por dia(R$): ");
        double preçoPorDia = sc.nextDouble();

        Serviço_de_aluguel aluguelServiço = new Serviço_de_aluguel(preçoPorDia, preçoPorHora, new Serviço_de_imposto_no_Brasil());

        aluguelServiço.processamentoDeFatura(adc);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: R$ " + String.format("%.2f", adc.getFatura().getPagamentoBásico()));
        System.out.println("Imposto: R$ " + String.format("%.2f", adc.getFatura().getImposto()));
        System.out.println("Total à pagar: R$ " + String.format("%.2f", adc.getFatura().getTotalDePagamento()));

        sc.close();
    }
}
