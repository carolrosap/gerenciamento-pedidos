package model;

public class Produto {
	private String descricao;
	private Integer codigoProduto;
	private Double valor;
	private Integer quantidade;
	
	/*public Produto(String descricao, Integer codigo, Double valor) {
		this.descricao = descricao;
		this.codigoProduto = codigo;
		this.valor = valor;
	}*/

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigoProduto;
	}

	public void setCodigo(Integer codigo) {
		this.codigoProduto = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
