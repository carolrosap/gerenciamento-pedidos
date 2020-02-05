package view;
import java.io.IOException;
import java.util.Scanner;

import model.Cliente;
import model.Produto;
import service.CadastraCliente;
import service.CadastraProduto;
import service.Dados;

public class Menu {
	private Integer opcao;
	private static ClienteView clienteView = new ClienteView();
	private static ProdutoView produtoView = new ProdutoView();
	private static PedidoView pedidoView = new PedidoView();
	private static Dados dados = new Dados();
	private static CadastraProduto cadastraProduto = new CadastraProduto();
	private static CadastraCliente cadastraCliente = new CadastraCliente();
	private static Scanner sc = new Scanner(System.in);
	private Produto produto;
	private Cliente cliente;

	public void printa() {
		System.out.println("----------Gerenciamento de pedidos-----");
		System.out.println("----------Selecione uma opção----------");
		System.out.println("1 - Verificar estoque");
		System.out.println("2 - Realizar pedido");
		System.out.println("3 - Cadastrar produto");
		System.out.println("4 - Cadastrar Cliente");
		System.out.println("5 - Sair");
		//System.out.println("6 - Listar Produtos");
		//System.out.println("7 - Listar Clientes");
		System.out.print("Digite aqui a sua opção: ");
	}
	public void init() {
		dados.carregaTodos(); 
		//carrega
	}
	
	public void leituraOpcao() {
		this.opcao = sc.nextInt();	
		
	}
	public Integer getOpcao() {
		return this.opcao;
	}
	public void gerenciaOpcao() throws IOException{
		switch(this.opcao) {
		case 1:
			//verificarEstoque
			//listagem
			produtoView.estoque(dados);
			break;
		case 2:
			//realizar pedido
			//produto
			//cliente
			//quantidade
			pedidoView.telaCadastro(dados);
			break;
		case 3:
			//cadastrar produto;
			produto = produtoView.leituraProduto();
			//executa o cadastro dos produtos, pega os anteriores pelo dados
			dados = cadastraProduto.executa(produto, dados);
			break;
		case 4:
			//cadastrar cliente
			cliente = clienteView.leituraCliente();
			dados = cadastraCliente.executa(cliente,dados);
			break;
		case 5: 
			//sair
			break;
		default:
			//exception opção errada
			break;
		}
	}

	public void closeScanner() {
		sc.close();
		
	}

	
}
