package Controle;

import java.util.ArrayList;

import Modelo.Fornecedor;

public class FornecedorDAO {

	private static FornecedorDAO instancia;
	private static ArrayList<Fornecedor> listaFornecedores;

	public static FornecedorDAO getinstancia() {

		if (instancia == null) {
			instancia = new FornecedorDAO();
			listaFornecedores = new ArrayList<>();
		}
		return instancia;
	}

	public Boolean Inserir(Fornecedor f) {
		listaFornecedores.add(f);
		return false;
	}

	public Boolean Alterar(Fornecedor f) {
		return false;
	}

	public Boolean Deletar(Fornecedor f) {
		return false;
	}

	public ArrayList<Fornecedor> Listar() {
		return listaFornecedores;
	}
}