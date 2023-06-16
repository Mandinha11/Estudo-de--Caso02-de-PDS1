package ModeloDeTabela;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import modelo.Fornecedor;

public class TabelaFunc extends AbstractTableModel{
	private String[] columnNames = {"Nome", "Cpf", "Nacimento","Cargo"};
	private ArrayList<Fornecedor> listaFornecedor;
	
	public int getColumnCount() {
		return columnNames.length;
	}

	
	public int getRowCount() {
		return listaFornecedor.size();
	}

	
	public Object getValueAt(int row, int col) {
		Fornecedor f = listaFornecedor.get(row);
		if(col == 0) {
			return f.ge
		}
	}

	
}
