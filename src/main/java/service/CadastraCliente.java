package service;

import java.io.IOException;

import dao.ClienteDao;
import model.Cliente;

public class CadastraCliente {

	private ClienteDao clienteDAO;

	public void executa(Cliente cliente, Dados dados) {
		this.clienteDAO = dados.getClienteDao();
		try {
			clienteDAO.adiciona(cliente);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
