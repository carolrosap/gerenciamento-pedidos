package service;

import java.util.Set;

import dao.ClienteDao;
import dao.ProdutoDao;
import model.Cliente;
import model.Produto;

public class Dados {
	private ProdutoDao produtoDAO = new ProdutoDao();
	private ClienteDao clienteDAO = new ClienteDao();
	
	public void carregaTodos(){
		produtoDAO.carrega();
		//Set<Produto> produtos = produtoDAO.getProdutos();
		
		clienteDAO.carrega();
		//Set<Cliente> clientes = clienteDAO.getClientes();
		//produtos.forEach(produto->{System.out.println(produto);});
	}
	
	public ProdutoDao getProdutoDao() {
		return this.produtoDAO;
	}
	
	public ClienteDao getClienteDao() {
		return this.clienteDAO;
	}
	public void setClienteDao(ClienteDao cliente) {
		this.clienteDAO = cliente;
	}
	public void setProdutoDao(ProdutoDao produto) {
		this.produtoDAO = produto;
	}
	
}
