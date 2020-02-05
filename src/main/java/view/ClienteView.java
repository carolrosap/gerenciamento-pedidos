package view;

import java.util.Scanner;

import model.Cliente;
import model.Produto;
import service.CadastraCliente;

public class ClienteView {
	private static Scanner sc = new Scanner(System.in);
	public Cliente leituraCliente(){
		Cliente cliente = new Cliente();
		System.out.print("Nome: ");
		cliente.setNome(sc.next());
		System.out.println("Código: ");
		cliente.setCodigoCliente(sc.nextInt());
		System.out.print("CPF: ");
		cliente.setCpf(sc.next());
		return cliente;
	}
}
