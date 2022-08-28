package model;

import java.time.LocalDate;

public class Vendas {
	
	private LocalDate dataEmissao;
	private Double precoTotal;
	private Cliente cliente;
	private List<Compras> itensVenda;
	
	public Vendas(LocalDate dataEmissao, Cliente cliente) {
		this.dataEmissao = dataEmissao;
		this.cliente = cliente;
	}
	public Vendas() {
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Double getPrecoTotal() {
		return precoTotal;
	}
	public void setPecoTotal(double precototal) {
		this.precoTotal = precoTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Compras> getItensVenda() {
		return itensVenda;
	}
	public void setItensVenda(List<Compras> itensVenda) {
		this.itensVenda = itensVenda;
	}
}