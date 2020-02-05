package test;
import java.io.IOException;

import service.CadastraCliente;
import service.CadastraPedido;
import service.CadastraProduto;
import view.Menu;

public class App {
	
	private static Menu menu = new Menu();
	
	public static void main(String[] args) throws IOException{
		menu.init();
		do {
			menu.printa();
			menu.leituraOpcao();
			menu.gerenciaOpcao();
		}while(menu.getOpcao()!=5);
		
		menu.closeScanner();
		
	}
		
}
