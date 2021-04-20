package ordem;

import entidadesEnumM13.NivelTrabalhadores;
import entidadesM13.Departamento;
import entidadesM13.HoraDeContrato;
import entidadesM13.Trabalhadores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class A2 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Insira o nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Insira os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("N�vel: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Sal�rio Base: ");
		double salarioBase = sc.nextDouble();
		Trabalhadores trab = new Trabalhadores(nomeTrabalhador, NivelTrabalhadores.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.println("Quantos contratos este trabalhador vai tem?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Insira os dados do Contrato #" + i + ": ");
			System.out.println("Dados (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Dura��o(horas): ");
			int horas = sc.nextInt();
			HoraDeContrato contrato = new HoraDeContrato(dataContrato, valorPorHora, horas);
			trab.addContrato(contrato);
		}
		System.out.println();
		System.out.print("Insira o m�s e ano para calcular a renda(MM/AAAA): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trab.getNome());
		System.out.println("Departamento: " + trab.getDepartamento().getNome());
		System.out.println("Renda para " + mes + "/" + ano + ": " + String.format("%.2f", trab.renda(ano, mes)));
		
		
		sc.close();
	}

}
