package dao;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

import lib.jackson.XML;
import model.Produto;

public class ProdutoDao {
	
	private String nomeArquivo = "produtos.xml";
	private File arquivo = new File(nomeArquivo);
	private Set<Produto> produtos = new LinkedHashSet<>();
	private XML xml = new XML();
	
	public void adiciona(Produto produto) throws JsonGenerationException, JsonMappingException, IOException {
		produtos.add(produto);
		xml.escreveLista(produtos, arquivo, nomeArquivo);
	}
	
	public void carrega() {
		TypeReference<Set<Produto>> typeReference = new TypeReference<Set<Produto>>() {};
		Set<Produto> lista = null;
		Set<Produto> carrega = (Set<Produto>) xml.carrega(arquivo, typeReference, lista);
		produtos.addAll(carrega);
	}
	
	public Set<Produto> getProdutos(){
		return this.produtos;
	}

}
