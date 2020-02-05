package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import dao.ClienteDao;
import dao.ProdutoDao;
import model.Cliente;
import model.Produto;

public class CadastraPedido {
	private ClienteDao clienteDAO = new ClienteDao();
	private ProdutoDao produtoDAO = new ProdutoDao();
	private static Scanner sc = new Scanner(System.in);

	public Cliente selecionaCliente(Dados dados) {
		Integer codigo;
		this.clienteDAO = dados.getClienteDao();
		List<Cliente> clientes = new ArrayList<>();
		clientes.addAll(clienteDAO.getClientes());

		Collections.sort(clientes, Comparator.comparing(Cliente::getNome));
		clientes.forEach(cliente -> {
			System.out.println(cliente.getCodigoCliente() + "\t\t\t " + cliente.getNome());
		});
		System.out.print("Código do cliente: ");
		codigo = sc.nextInt();
		Cliente clientePedido = null;
		
		for (Cliente cliente : clientes) {
			if(cliente.getCodigoCliente() == codigo)
				clientePedido = cliente;
		}
		System.out.println(clientePedido);
		//fazer tratamento
		return clientePedido;
		// TODO Auto-generated method stub
	}
	public Produto selecionaProduto(Dados dados) {
		Integer codigo;
		this.produtoDAO = dados.getProdutoDao();
		List<Produto> produtos = new ArrayList<>();
		produtos.addAll(produtoDAO.getProdutos());

		Collections.sort(produtos, Comparator.comparing(Produto::getDescricao));
		produtos.forEach(produto -> {
			System.out.println(produto.getCodigo() + "\t\t\t " + produto.getDescricao());
		});
		System.out.print("Código do produto: ");
		codigo = sc.nextInt();
		System.out.println(codigo);
		Produto produtoPedido = null;
		
		for (Produto produto : produtos) {
			if(produto.getCodigo() == codigo)
				produtoPedido = produto;
		}
		//fazer tratamento
		return produtoPedido;
		// TODO Auto-generated method stub
	}

}
