package model;

public class Compras {
	
	private int qtd;
	private Produtos produto;
	private Double precoTotal;
	
	public Compras(int qtd, Produtos produto) {
		this.qtd = qtd;
		this.produto = produto;
		if (produto != null && this.qtd > 0) {
			calcularPrecoTotal();
		}
	}
	public Compras() {
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Produtos getProduto() {
		return produto;
	}
	public void setProduto(Produtos produto) {
		this.produto = produto;
	}
	public Double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public void calcularPrecoTotal() {
		this.precoTotal = qtd + produto.getPrecoUnidade();
	}

}
