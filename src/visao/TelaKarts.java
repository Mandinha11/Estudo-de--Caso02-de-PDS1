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
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class TelaKarts extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTable table;
	private JTextField txtMotor;
	private JTextField txtId;
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
		panel.setBounds(1027, 57, 789, 873);
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(368, 161, 1, 1);
		panel.add(table);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(54, 612, 390, 41);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Karts karts = new Karts();
				
				
				KartsDAO kartsDao = KartsDAO.getinstancia();
				
				
			
				
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
		btnCadastrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(btnCadastrar);
		
		JLabel lblBuscarKarts = new JLabel("Cor:");
		lblBuscarKarts.setBounds(100, 100, 67, 30);
		contentPane.add(lblBuscarKarts);
		lblBuscarKarts.setForeground(new Color(0, 0, 0));
		lblBuscarKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(480, 100, 104, 30);
		contentPane.add(lblQuantidade);
		lblQuantidade.setForeground(new Color(0, 0, 0));
		lblQuantidade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtMotor = new JTextField();
		txtMotor.setBounds(165, 169, 260, 30);
		contentPane.add(txtMotor);
		txtMotor.setColumns(10);
		
		JLabel lblMotor = new JLabel("Motor:");
		lblMotor.setBounds(80, 166, 104, 30);
		contentPane.add(lblMotor);
		lblMotor.setForeground(Color.BLACK);
		lblMotor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtFornecedor = new JTextField();
		txtFornecedor.setBounds(596, 169, 260, 30);
		contentPane.add(txtFornecedor);
		txtFornecedor.setColumns(10);
		
		txtId = new JTextField();
		txtId.setBounds(165, 253, 260, 30);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblIdKart = new JLabel("ID Kart:");
		lblIdKart.setBounds(69, 250, 104, 30);
		contentPane.add(lblIdKart);
		lblIdKart.setForeground(Color.BLACK);
		lblIdKart.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(525, 250, 59, 30);
		contentPane.add(lblAno);
		lblAno.setForeground(new Color(0, 0, 0));
		lblAno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtPreco = new JTextField();
		txtPreco.setBounds(164, 343, 261, 30);
		contentPane.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(80, 340, 67, 30);
		contentPane.add(lblPreo);
		lblPreo.setForeground(new Color(0, 0, 0));
		lblPreo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtModelo = new JTextField();
		txtModelo.setBounds(596, 343, 260, 30);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(505, 340, 67, 30);
		contentPane.add(lblModelo);
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtMarca = new JTextField();
		txtMarca.setBounds(597, 418, 259, 30);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblMarcaKarts = new JLabel("Marca:");
		lblMarcaKarts.setBounds(517, 415, 67, 30);
		contentPane.add(lblMarcaKarts);
		lblMarcaKarts.setForeground(new Color(0, 0, 0));
		lblMarcaKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JComboBox boxCor = new JComboBox();
		boxCor.setBounds(165, 105, 262, 26);
		contentPane.add(boxCor);
		boxCor.addItem("Selecionar Cor");
		boxCor.addItem("Amarelo");
		boxCor.addItem("Vermelho");
		boxCor.addItem("Azul");
		boxCor.addItem("Verde");
		boxCor.addItem("Rosa");
		boxCor.addItem("Roxo");
		boxCor.addItem("Preto");
		boxCor.addItem("Branco");
		boxCor.addItem("Cinza");
		
		
		JComboBox boxQuantidade = new JComboBox();
		boxQuantidade.setBounds(594, 104, 262, 29);
		contentPane.add(boxQuantidade);
		boxQuantidade.addItem("Selecinar Quantidade");
		boxQuantidade.addItem("1");
		boxQuantidade.addItem("2");
		boxQuantidade.addItem("3");
		boxQuantidade.addItem("4");
		boxQuantidade.addItem("5");
		boxQuantidade.addItem("6");
		boxQuantidade.addItem("7");
		boxQuantidade.addItem("8");
		boxQuantidade.addItem("9");
		boxQuantidade.addItem("10");
		
		JLabel lblNewLabel = new JLabel("Fornecedor:");
		lblNewLabel.setBounds(480, 170, 100, 22);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JComboBox boxAno = new JComboBox();
		boxAno.setBounds(596, 257, 260, 22);
		contentPane.add(boxAno);
		
		JComboBox boxDia = new JComboBox();
		boxDia.setBounds(165, 422, 80, 22);
		contentPane.add(boxDia);
		boxDia.addItem("01");
		boxDia.addItem("02");
		boxDia.addItem("03");
		boxDia.addItem("04");
		boxDia.addItem("05");
		boxDia.addItem("06");
		boxDia.addItem("07");
		boxDia.addItem("08");
		boxDia.addItem("09");
		boxDia.addItem("10");
		boxDia.addItem("11");
		boxDia.addItem("12");
		boxDia.addItem("13");
		boxDia.addItem("14");
		boxDia.addItem("15");
		boxDia.addItem("16");
		boxDia.addItem("17");
		boxDia.addItem("18");
		boxDia.addItem("19");
		boxDia.addItem("20");
		boxDia.addItem("21");
		boxDia.addItem("22");
		boxDia.addItem("23");
		boxDia.addItem("24");
		boxDia.addItem("25");
		boxDia.addItem("26");
		boxDia.addItem("27");
		boxDia.addItem("28");
		boxDia.addItem("29");
		boxDia.addItem("30");
		boxDia.addItem("31");
		
		JComboBox boxMes = new JComboBox();
		boxMes.setBounds(255, 422, 82, 22);
		contentPane.add(boxMes);
		boxMes.addItem("01");
		boxMes.addItem("02");
		boxMes.addItem("03");
		boxMes.addItem("04");
		boxMes.addItem("05");
		boxMes.addItem("06");
		boxMes.addItem("07");
		boxMes.addItem("08");
		boxMes.addItem("09");
		boxMes.addItem("10");
		boxMes.addItem("11");
		boxMes.addItem("12");
		
		JComboBox boxANO = new JComboBox();
		boxANO.setBounds(347, 422, 82, 22);
		contentPane.add(boxANO);
		
		boxANO.addItem("2023");
		
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(524, 612, 386, 41);
		btnExcluir.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(btnExcluir);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 57, 903, 501);
		panel_1.setBackground(new Color(211, 211, 211));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDataEntrada = new JLabel("Data Entrada:");
		lblDataEntrada.setBounds(27, 358, 104, 30);
		panel_1.add(lblDataEntrada);
		lblDataEntrada.setForeground(Color.BLACK);
		lblDataEntrada.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(TelaKarts.class.getResource("/imgs/FundoDeTela.jpg")));
		lblNewLabel_1.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblNewLabel_1);
	}
}
