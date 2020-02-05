package model;
import java.util.Calendar;
import java.util.Map;

public class Pedido {
	private Map<Integer,Integer> produtoQuantidade;
	private Cliente cliente;
	private Double valor;
	private Integer codigoPedido;
	public Map<Integer, Integer> getProdutoQuantidade() {
		return produtoQuantidade;
	}
	public void setProdutoQuantidade(Map<Integer, Integer> produtoQuantidade) {
		this.produtoQuantidade = produtoQuantidade;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	
	
	
	
	
	
	
	
}
