package entidadesM13;
///////////////////////////////////////  Aula 1 E 4 ///////////////////////////////

import entidadesEnumM13.StatusDoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoA4 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private StatusDoPedido status;
	
	private List<ItemDoPedido> itens = new ArrayList<>();
	private Cliente cliente;
	


	public PedidoA4(Date momento, StatusDoPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}
	
	
	public List<ItemDoPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemDoPedido> itens) {
		this.itens = itens;
	}

	public void addItem(ItemDoPedido item) {
		 itens.add(item);
	}
	public double total() {
		double soma = 0.0;
		for (ItemDoPedido item : itens) {
			soma +=item.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do PedidoA4: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do Pedido: ");
		sb.append(status + "\n");
		sb.append("\n Cliente: ");
		sb.append(cliente + "\n");
		sb.append("\n Itens do Pedido:\n");
		for (ItemDoPedido item : itens) { 
		       sb.append(item + "\n");
		}       
		sb.append("Pre�o Total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

	
	

}