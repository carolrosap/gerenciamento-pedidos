package service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import dao.ProdutoDao;
import model.Produto;

public class CadastraProduto {
	private ProdutoDao produtoDAO;
	
	public Dados executa(Produto produto, Dados dados) {
		this.produtoDAO = dados.getProdutoDao();
		//adiciona produto ao dao
		//dao adiona na lista
		//dao grava no arquivo
		try {
			produtoDAO.adiciona(produto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dados.setProdutoDao(produtoDAO);
		return dados;
	}
}
