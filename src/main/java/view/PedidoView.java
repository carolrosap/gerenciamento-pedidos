package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Pedido;
import model.Produto;
import service.CadastraPedido;
import service.Dados;

public class PedidoView {
	private static Pedido pedido = new Pedido();
	private static Scanner sc = new Scanner(System.in);
	private CadastraPedido cadastraPedido = new CadastraPedido();
	private Cliente cliente;
	private List<Produto> produtos = new ArrayList<>();
	private Integer quantidade;
	
	public void telaCadastro(Dados dados) {
		String opcao = null;
		System.out.println("----------Cadastrar Pedido-------------");
		System.out.println("---------------------------------------");
		System.out.println("---------Selecione um Cliente---------");
		System.out.println("---------Código \tCliente----------");
		cliente = cadastraPedido.selecionaCliente(dados);
			
		
		do {
			System.out.println("---------------------------------------");
			System.out.println("Selecione um Produto");
			System.out.println("---------Código \tProduto----------");
			produtos.add(cadastraPedido.selecionaProduto(dados));
			System.out.println("Quantidade: ");
			quantidade = sc.nextInt();
			System.out.println("Cadastrar mais um produto? S/N");
			opcao = sc.next();
		}while(!opcao.equals("N"));
		
	}
}
