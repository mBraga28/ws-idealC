package M13_enumercoes_composicao.Ordem;

import entidadesEnumM13.StatusDoPedido;
import entidadesM13.Cliente;
import entidadesM13.ItemDoPedido;
import entidadesM13.PedidoA4;
import entidadesM13.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entrar com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento (DD/MM/YYYY): ");
		Date dataDeNascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataDeNascimento);

		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusDoPedido status = StatusDoPedido.valueOf(sc.next());

		PedidoA4 pedido = new PedidoA4(new Date(), status, cliente);

		System.out.print("Quantos itens para o pedido? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Insira os dados do item #" + i);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Pre�o do produto: ");
			double precoProduto = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();

			ItemDoPedido ordemPedido;
			ordemPedido = new ItemDoPedido(quantidade, precoProduto, produto);

			pedido.addItem(ordemPedido);

		}

		System.out.println();
		System.out.println("SUMÁRIO DO PEDIDO: ");
		System.out.println(pedido);

        sc.close();
	}

}
