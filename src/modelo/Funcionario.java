package modelo;

public class Funcionario {

	private String nome;
	private String Cpf;
	private int Dia;
	private int Mes;
	private int Ano;
	private String Cargo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return Cpf;
	}
	public void setCPF(String Cpf) {
		this.Cpf = Cpf;
	}
	public int getDia() {
		return Dia;
	}
	public void setDia(int Dia) {
		this.Dia = Dia;
	}
	
	
	public int getMes() {
		return Mes;
	}
	public void setMes(int Mes) {
		this.Mes = Mes;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int Ano) {
		this.Ano = Ano;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String Cargo) {
		this.Cargo = Cargo;
	}
}
