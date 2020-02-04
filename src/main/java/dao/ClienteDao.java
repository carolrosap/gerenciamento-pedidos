package dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

import lib.jackson.XML;
import model.Cliente;

public class ClienteDao {
	private String nomeArquivo = "clientes.xml";
	private File arquivo = new File(nomeArquivo);
	private List<Cliente>clientes = new ArrayList<>();
	private XML xml = new XML();
	
	public void adiciona(Cliente cliente) throws JsonGenerationException, JsonMappingException, IOException {
		clientes.add(cliente);
		xml.escreveLista(clientes, arquivo, nomeArquivo);
	}
	
	public void carrega() {
		TypeReference<List<Cliente>> typeReference = new TypeReference<List<Cliente>>() {};
		List<Cliente> lista = null;
		List<Cliente> carrega = (List<Cliente>) xml.carrega(arquivo, typeReference, lista);
		clientes.addAll(carrega);
	}
	
	public List<Cliente> getClientes(){
		return this.clientes;
	}

}
