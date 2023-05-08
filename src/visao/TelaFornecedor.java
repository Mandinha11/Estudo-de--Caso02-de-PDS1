package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.FornecedorDAO;
import Modelo.Fornecedor;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;

public class TelaFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeEmpresa;
	private JTextField txtCPF;
	private JTextField txtCNPJ;
	private JTextField txtTelefone;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFornecedor frame = new TelaFornecedor();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaFornecedor() {
		setTitle("Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1940, 1162);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(12, 12, 127, 28);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaSelecao ts = new TelaSelecao();
				ts.setExtendedState(JFrame.MAXIMIZED_BOTH);
				ts.setVisible(true);
		
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);

		JLabel lblNomeEmpresa = new JLabel("Nome da empresa:");
		lblNomeEmpresa.setBounds(518, 39, 141, 28);
		lblNomeEmpresa.setForeground(new Color(0, 0, 0));
		lblNomeEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNomeEmpresa);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(1126, 39, 34, 28);
		lblCpf.setForeground(new Color(0, 0, 0));
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblCpf);

		txtNomeEmpresa = new JTextField();
		txtNomeEmpresa.setBounds(669, 88, 335, 28);
		contentPane.add(txtNomeEmpresa);
		txtNomeEmpresa.setColumns(10);

		txtCPF = new JTextField();
		txtCPF.setBounds(1170, 89, 335, 27);
		txtCPF.setColumns(10);
		contentPane.add(txtCPF);

		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(618, 84, 43, 31);
		lblCnpj.setForeground(new Color(0, 0, 0));
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblCnpj);

		txtCNPJ = new JTextField();
		txtCNPJ.setBounds(669, 42, 335, 28);
		txtCNPJ.setColumns(10);
		contentPane.add(txtCNPJ);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(1090, 84, 70, 31);
		lblTelefone.setForeground(new Color(0, 0, 0));
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblTelefone);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(1170, 42, 335, 28);
		txtTelefone.setColumns(10);
		contentPane.add(txtTelefone);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(1687, 273, 210, 42);
		btnCadastrar.setBackground(new Color(255, 255, 255));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fornecedor fornecedor = new Fornecedor();
				FornecedorDAO fornecedorDao = FornecedorDAO.getinstancia();
				fornecedor.setNomeEmpressa(txtNomeEmpresa.getText());
				fornecedor.setCnpj(Long.valueOf(txtCNPJ.getText()));
				fornecedor.setCpf(Long.valueOf(txtCPF.getText()));
				fornecedor.setTelefone(Long.valueOf(txtTelefone.getText()));
				
				if(fornecedorDao.Inserir(fornecedor)==true) {
					JOptionPane.showMessageDialog(btnCadastrar, "Boa");
				}else {
					JOptionPane.showMessageDialog(btnCadastrar, "Deu não");
				}
				 if (txtNomeEmpresa.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(btnCadastrar, "Campo de texto não cadastrado!!");
					 return;
			        }
				
				
			}
			

			
		});
		contentPane.add(btnCadastrar);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(1687, 135, 210, 42);
		btnAtualizar.setBackground(new Color(255, 255, 255));
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnAtualizar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(1687, 204, 208, 42);
		btnExcluir.setBackground(new Color(255, 255, 255));
		contentPane.add(btnExcluir);

		JPanel panel = new JPanel();
		panel.setBounds(25, 135, 1616, 855);
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(new MigLayout("", "[145.00px,grow]", "[82.00px,grow]"));

		table = new JTable();
		panel.add(table);
		
		JLabel lblTelaDeFundo = new JLabel("New label");
		lblTelaDeFundo.setIcon(new ImageIcon(TelaFornecedor.class.getResource("/imgs/FundoDeTela.jpg")));
		lblTelaDeFundo.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblTelaDeFundo);
	}
	
	public void atualizarTabela(ArrayList<Fornecedor> Usuario) {
	    // Limpa o modelo da tabela
//		table.setRowCount(0);
	    
	    // Adiciona as pessoas como novas linhas da tabela
		for (Fornecedor fornecedor : Usuario) {
	        Object[] linha = {fornecedor.getCnpj(), fornecedor.getCpf(), fornecedor.getNomeEmpressa(), fornecedor.getTelefone()};
//	        table.addRow(linha);
		}
	}

}
