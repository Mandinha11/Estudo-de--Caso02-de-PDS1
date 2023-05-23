package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ClienteDAO;
import controle.KartsDAO;
import controle.VendasDAO;
import modelo.Cliente;
import modelo.Karts;
import modelo.Vendas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField txtData;
	private JTextField txtKart;
	private JTextField txtCliente;
	private JTextField txtPreco;
	private JTable TabelaKarts;
	private JTextField txtMatricula;
	private Vendas vendasSelecionada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas frame = new TelaVendas();
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
	public TelaVendas() {
		setTitle("Vendas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2015, 1092);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(281, 187, 1588, 807);
		contentPane.add(panel);
		
		TabelaKarts = new JTable();
		TabelaKarts.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int posicaoVendas = TabelaKarts.getSelectedRow();
				vendasSelecionada = listaVendas.get(posicaoVendas);
				txtNome.setText(pessoaSelecionada.getNome());
				txtCPF.setText(pessoaSelecionada.getCpf());
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "CPF" }));

		
		JButton btnCadastra = new JButton("Cadastrar");
		btnCadastra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Vendas vendas = new Vendas();
				
				
				VendasDAO vendasDao = VendasDAO.getinstancia();
				
				 if (txtCliente.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Nome do cliente não preenchido!!");
					 return;
			        }
				 else {
					 vendas.setcliente(txtCliente.getText());
				 }
				
				 if (txtData.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Data não preenchido!!");
					 return;
				 }
				 else {
				vendas.setdata(Long.valueOf(txtData.getText()));
				 }
				 
				 if (txtPreco.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Preço não preenchido!!");
					 return;
				 }
				 else {
				vendas.setpreco(Long.valueOf(txtPreco.getText()));
				 }
				
				
				 if (txtKart.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Kart não preenchido!!");
					 return;
			        }
				 else {
					 vendas.setkarts(txtKart.getText());
				 }
				 
				 if (txtMatricula.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Matricula do Funcionario não preenchido!!");
					 return;
				 }
				 else {
				vendas.setmatricula(Long.valueOf(txtMatricula.getText()));
				 }
				
				 
			}
		});
		btnCadastra.setBounds(51, 187, 167, 49);
		contentPane.add(btnCadastra);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaSelecao ts = new TelaSelecao();
				ts.setExtendedState(JFrame.MAXIMIZED_BOTH);
				ts.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 11, 121, 28);
		contentPane.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(281, 31, 483, 55);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtData = new JTextField();
		txtData.setBounds(153, 16, 304, 28);
		panel_1.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 16, 48, 24);
		panel_1.add(lblData);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(211, 211, 211));
		panel_1_1.setBounds(281, 104, 483, 55);
		contentPane.add(panel_1_1);
		
		txtKart = new JTextField();
		txtKart.setColumns(10);
		txtKart.setBounds(153, 16, 304, 28);
		panel_1_1.add(txtKart);
		
		JLabel lblKartVendido = new JLabel("Id Kart:");
		lblKartVendido.setBounds(10, 16, 102, 24);
		panel_1_1.add(lblKartVendido);
		lblKartVendido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(211, 211, 211));
		panel_1_2.setBounds(850, 31, 483, 55);
		contentPane.add(panel_1_2);
		
		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBounds(153, 16, 304, 28);
		panel_1_2.add(txtCliente);
		
		JLabel lblComprador = new JLabel("Cliente CPF/CNPJ:");
		lblComprador.setBounds(10, 18, 133, 20);
		panel_1_2.add(lblComprador);
		lblComprador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(new Color(211, 211, 211));
		panel_1_2_1.setBounds(850, 104, 483, 55);
		contentPane.add(panel_1_2_1);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(153, 16, 304, 28);
		panel_1_2_1.add(txtPreco);
		
		JLabel lblNewLabel = new JLabel("Valor Da Venda:");
		lblNewLabel.setBounds(10, 16, 121, 24);
		panel_1_2_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		

		JLabel lblFundoDeTela = new JLabel("");
		lblFundoDeTela.setIcon(new ImageIcon(TelaVendas.class.getResource("/imgs/FundoDeTela.jpg")));
		lblFundoDeTela.setBounds(0, 0, 1924, 1053);
		contentPane.add(lblFundoDeTela);

		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBackground(new Color(211, 211, 211));
		panel_1_2_2.setBounds(1362, 31, 507, 55);
		contentPane.add(panel_1_2_2);
		
		txtMatricula = new JTextField();
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(193, 16, 304, 28);
		panel_1_2_2.add(txtMatricula);
		
		JLabel lblMatriculaFuncionario = new JLabel("Matricula Funcionario:");
		lblMatriculaFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMatriculaFuncionario.setBounds(10, 18, 156, 20);
		panel_1_2_2.add(lblMatriculaFuncionario);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaVendas.class.getResource("/imgs/FundoDeTela.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1924, 1063);
		contentPane.add(lblNewLabel_1);

	}
}
