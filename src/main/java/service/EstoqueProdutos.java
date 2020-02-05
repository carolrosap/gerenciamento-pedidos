package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import dao.ProdutoDao;
import model.Produto;

public class EstoqueProdutos {
	private ProdutoDao produtoDAO;
	
	public void lista(Dados dados) {
		this.produtoDAO = dados.getProdutoDao();
		List<Produto> produtos = new ArrayList<>();
		produtos.addAll(produtoDAO.getProdutos());
		
		Collections.sort(produtos, Comparator.comparing(Produto::getDescricao));
		produtos.forEach(produto -> {
		    System.out.println(produto.getDescricao() + "\t\t\t " + produto.getQuantidade());
		});

		//return produtoDAO.getProdutos();
	}
	
	public void verificaEstoque() {
		
	}

}
