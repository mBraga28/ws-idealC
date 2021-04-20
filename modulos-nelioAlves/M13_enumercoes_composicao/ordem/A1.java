package ordem;


import entidadesEnumM13.StatusDoPedido;
import entidadesM13.Pedido;

import java.util.Date;

public class A1 {
	
	public static void main(String[] args) {
	
		Pedido pedido = new Pedido(1080, new Date(), StatusDoPedido.PROCESSANDO);
		
		System.out.println(pedido);
		
		StatusDoPedido sdp1 = StatusDoPedido.ENTREGUE;
		
		StatusDoPedido sdp2 = StatusDoPedido.valueOf("ENTREGUE");
		
		System.out.println(sdp1);
		System.out.println(sdp2);
		
	}
}
