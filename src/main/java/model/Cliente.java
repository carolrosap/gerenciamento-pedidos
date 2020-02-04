package model;
import java.util.Calendar;

public class Cliente {
	private String nome;
	private String cpf;
	//private Calendar dataNascimento;
	//Calendar dataNascimento = new GregorianCalendar(1985, 3, 18);
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/*public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}*/
	
}
