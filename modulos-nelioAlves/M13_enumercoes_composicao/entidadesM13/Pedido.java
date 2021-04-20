package entidadesM13;
///////////////////////////////////////  Aula 1 ///////////////////////////////

import entidadesEnumM13.StatusDoPedido;

import java.util.Date;

public class Pedido {
	
	private Integer id;
	private Date momento;
	private StatusDoPedido status;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date momento, StatusDoPedido status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Pedido [ ID: " 
	           + id + ", Momento: " 
			   + momento 
			   + ", Status: " 
			   + status 
			   + " ]";
	}
	
	

}
