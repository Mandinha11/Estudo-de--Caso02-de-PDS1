package Modelo;

public class Cliente {
	
	private String nomeCompleto;
	private Long cpf;
	private Long telefone;
	
	public Cliente(){
		
	}
	
	public String getNomeEmpressa() {
		return nomeCompleto;
	}
	public void setNomeEmpressa(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	

}



