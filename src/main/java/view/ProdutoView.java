package view;

import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import model.Produto;
import service.Dados;
import service.EstoqueProdutos;

public class ProdutoView {
	
	private static Scanner sc = new Scanner(System.in);
	private Produto produto;
	private EstoqueProdutos estoqueProdutos= new EstoqueProdutos();

	public Produto leituraProduto() throws JsonGenerationException, JsonMappingException, IOException{
		produto = new Produto();
		System.out.print("Código do Produto: ");
		produto.setCodigo(sc.nextInt());
		System.out.print("Descrição: ");
		produto.setDescricao(sc.next());
		System.out.print("Valor: ");
		produto.setValor(sc.nextDouble());
		System.out.print("Quantidade: ");
		produto.setQuantidade(sc.nextInt());
		return produto;
	}
	
	public void estoque(Dados dados) {
		System.out.println("----------Produtos em estoque----------");
		System.out.println("Produto \t\t Quantidade");
		System.out.println("---------------------------------------");
		estoqueProdutos.lista(dados);
	}
}

