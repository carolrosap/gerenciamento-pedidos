package dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

import lib.jackson.XML;
import model.Produto;

public class ProdutoDao {
	
	private String nomeArquivo = "produtos.xml";
	private File arquivo = new File(nomeArquivo);
	private List<Produto> produtos = new ArrayList<>();
	private XML xml = new XML();
	
	public void adiciona(Produto produto) throws JsonGenerationException, JsonMappingException, IOException {
		produtos.add(produto);
		xml.escreveLista(produtos, arquivo, nomeArquivo);
	}
	
	public void carrega() {
		TypeReference<List<Produto>> typeReference = new TypeReference<List<Produto>>() {};
		List<Produto> lista = null;
		List<Produto> carrega = (List<Produto>) xml.carrega(arquivo, typeReference, lista);
		produtos.addAll(carrega);
	}
	
	public List<Produto> getProdutos(){
		return this.produtos;
	}

}
