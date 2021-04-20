package entidadesM13;
public class ItemDoPedido {
	
	private Integer quantidade;
	private Double preco;

	private Produto produto;

	public ItemDoPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public double subTotal() {
		return preco * quantidade;
	}
	
	public String toString1() {
		return produto.getNome()
				      + ", R$"
				      + String.format("%.2f", preco)
				      + ", Quantidade: "
				      + quantidade
				      + ", Subtotal: "
				      + String.format("%.2f", subTotal());
	}

}
