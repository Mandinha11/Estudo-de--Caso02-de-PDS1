package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.ClienteDAO;
import Controle.KartsDAO;
import Modelo.Cliente;
import Modelo.Karts;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class TelaKarts extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtCor;
	private JTextField txtMarca;
	private JTextField txtAno;
	private JTextField txtQuantidade;
	private JTextField txtModelo;
	private JTable table;
	private JTextField txtMotor;
	private JTextField txtId;
	private JTextField txtData;
	private JTextField txtFornecedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaKarts frame = new TelaKarts();
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
	public TelaKarts() {
		setTitle("Karts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2218, 1126);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 126, 30);
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
		
		Panel panel = new Panel();
		panel.setBounds(473, 84, 1343, 873);
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(368, 161, 1, 1);
		panel.add(table);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Karts karts = new Karts();
				
				
				KartsDAO kartsDao = KartsDAO.getinstancia();
				
				 if (txtCor.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Cor não preenchido!!");
					 return;
			        }
				 else {
					 karts.setcor(txtCor.getText());
				 }
				
				 if (txtQuantidade.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Quantidade não preenchido!!");
					 return;
				 }
				 else {
				karts.setquantidade(Long.valueOf(txtQuantidade.getText()));
				 }
				 
				 if (txtAno.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Ano não preenchido!!");
					 return;
				 }
				 else {
				karts.setano(Long.valueOf(txtAno.getText()));
				 }
				
				 if (txtPreco.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Preço não preenchido!!");
					 return;
				 }
				 else {
				karts.setpreco(Long.valueOf(txtPreco.getText()));
				 }
			
				 if (txtMarca.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Marca não preenchido!!");
					 return;
				 }
				 else {
				karts.setmarca(String.valueOf(txtMarca.getText()));
				 }
				 
				 if (txtModelo.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Modelo não preenchido!!");
					 return;
				 }
				 else {
				karts.setmodelo(String.valueOf(txtModelo.getText()));
				 }
				 if (txtData.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Data de Entrada não preenchido!!");
					 return;
				 }
				 else {
				karts.setdataEntrada(Long.valueOf(txtData.getText()));
				 }
				 
				 if (txtId.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Id Kart não preenchido!!");
					 return;
				 }
				 else {
				karts.setId(Long.valueOf(txtId.getText()));
				 }
				 
				 if (txtFornecedor.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "CNPJ do Fornecedor não preenchido!!");
					 return;
				 }
				 else {
				karts.setforneCNPJ(Long.valueOf(txtFornecedor.getText()));
				 }
				 
				 if (txtMotor.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Motor não preenchido!!");
					 return;
				 }
				 else {
				karts.setmotor(String.valueOf(txtMotor.getText()));
				 }
				 
			}
		});
		
		btnCadastrar.setBounds(26, 804, 424, 41);
		btnCadastrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(btnCadastrar);
		
		JLabel lblBuscarKarts = new JLabel("Cor:");
		lblBuscarKarts.setBounds(100, 100, 67, 30);
		contentPane.add(lblBuscarKarts);
		lblBuscarKarts.setForeground(new Color(0, 0, 0));
		lblBuscarKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtCor = new JTextField();
		txtCor.setBounds(165, 103, 262, 30);
		contentPane.add(txtCor);
		txtCor.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(165, 164, 260, 30);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(51, 161, 104, 30);
		contentPane.add(lblQuantidade);
		lblQuantidade.setForeground(new Color(0, 0, 0));
		lblQuantidade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtMotor = new JTextField();
		txtMotor.setBounds(167, 219, 260, 30);
		contentPane.add(txtMotor);
		txtMotor.setColumns(10);
		
		JLabel lblMotor = new JLabel("Motor:");
		lblMotor.setBounds(80, 216, 104, 30);
		contentPane.add(lblMotor);
		lblMotor.setForeground(Color.BLACK);
		lblMotor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtFornecedor = new JTextField();
		txtFornecedor.setBounds(165, 287, 260, 30);
		contentPane.add(txtFornecedor);
		txtFornecedor.setColumns(10);
		
		txtId = new JTextField();
		txtId.setBounds(167, 363, 260, 30);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblIdKart = new JLabel("ID Kart:");
		lblIdKart.setBounds(80, 363, 104, 30);
		contentPane.add(lblIdKart);
		lblIdKart.setForeground(Color.BLACK);
		lblIdKart.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtAno = new JTextField();
		txtAno.setBounds(166, 434, 261, 30);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(100, 434, 59, 30);
		contentPane.add(lblAno);
		lblAno.setForeground(new Color(0, 0, 0));
		lblAno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtPreco = new JTextField();
		txtPreco.setBounds(166, 503, 261, 30);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(80, 500, 67, 30);
		contentPane.add(lblPreo);
		lblPreo.setForeground(new Color(0, 0, 0));
		lblPreo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtModelo = new JTextField();
		txtModelo.setBounds(167, 578, 260, 30);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(80, 575, 67, 30);
		contentPane.add(lblModelo);
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtData = new JTextField();
		txtData.setBounds(167, 645, 260, 30);
		contentPane.add(txtData);
		txtData.setColumns(10);
		
		JLabel lblDataEntrada = new JLabel("Data Entrada:");
		lblDataEntrada.setBounds(51, 642, 104, 30);
		contentPane.add(lblDataEntrada);
		lblDataEntrada.setForeground(Color.BLACK);
		lblDataEntrada.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtMarca = new JTextField();
		txtMarca.setBounds(168, 715, 259, 30);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblMarcaKarts = new JLabel("Marca:");
		lblMarcaKarts.setBounds(88, 712, 67, 30);
		contentPane.add(lblMarcaKarts);
		lblMarcaKarts.setForeground(new Color(0, 0, 0));
		lblMarcaKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 84, 424, 698);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFornecedorCnpj = new JLabel("Fornecedor CNPJ:");
		lblFornecedorCnpj.setBounds(10, 201, 174, 30);
		panel_1.add(lblFornecedorCnpj);
		lblFornecedorCnpj.setForeground(Color.BLACK);
		lblFornecedorCnpj.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaKarts.class.getResource("/imgs/FundoDeTela.jpg")));
		lblNewLabel.setBounds(-14, 0, 1949, 1061);
		contentPane.add(lblNewLabel);
	}
}
