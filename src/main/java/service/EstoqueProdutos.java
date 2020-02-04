package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import dao.ProdutoDao;
import model.Produto;

public class EstoqueProdutos {
	private ProdutoDao produtoDAO;
	
	public void lista(Dados dados) {
		this.produtoDAO = dados.getProdutoDao();
		Set<Produto> produtos = produtoDAO.getProdutos();
		produtos.forEach(produto -> {
		    System.out.println(produto.getDescricao() + "\t\t\t " + produto.getQuantidade());
		});

		//return produtoDAO.getProdutos();
	}

}
