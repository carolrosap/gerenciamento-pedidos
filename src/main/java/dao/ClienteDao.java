package dao;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

import lib.jackson.XML;
import model.Cliente;

public class ClienteDao {
	private String nomeArquivo = "clientes.xml";
	private File arquivo = new File(nomeArquivo);
	private Set<Cliente>clientes = new LinkedHashSet<>();
	private XML xml = new XML();
	
	public void adiciona(Cliente cliente) throws JsonGenerationException, JsonMappingException, IOException {
		clientes.add(cliente);
		xml.escreveLista(clientes, arquivo, nomeArquivo);
	}
	
	public void carrega() {
		TypeReference<Set<Cliente>> typeReference = new TypeReference<Set<Cliente>>() {};
		Set<Cliente> lista = null;
		Set<Cliente> carrega = (Set<Cliente>) xml.carrega(arquivo, typeReference, lista);
		clientes.addAll(carrega);
	}
	
	public Set<Cliente> getClientes(){
		return this.clientes;
	}

}
