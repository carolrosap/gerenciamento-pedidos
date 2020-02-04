package service;

import java.util.List;

import dao.ProdutoDao;
import model.Produto;

public class EstoqueProdutos {
	private ProdutoDao produtoDAO;
	
	public void lista(Dados dados) {
		this.produtoDAO = dados.getProdutoDao();
		List<Produto> produtos = produtoDAO.getProdutos();
		produtos.sort();
		produtos.forEach(produto -> {
		    System.out.println(produto.getDescricao() + "\t\t\t " + produto.getQuantidade());
		});

		//return produtoDAO.getProdutos();
	}

}
