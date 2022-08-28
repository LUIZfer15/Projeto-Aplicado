package model;

public class Produtos {
	
	private String descricao;
	private Double precoUnidade;
	
	public Produtos(String descrição, Double precoUnidade) {
		this.descricao = descrição;
		this.precoUnidade = precoUnidade;
	}
	public Produtos() {
	}
	public String getDescrição() {
		return descricao;
	}
	public void setDescrição(String descrição) {
		this.descricao = descrição;
	}
	public Double getPrecoUnidade() {
		return precoUnidade;
	}
	public void setPrecoUnidade(double precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	
	public String toString() {
		return descricao;
	}

}
