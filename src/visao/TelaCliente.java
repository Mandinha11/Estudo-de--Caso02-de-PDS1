package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.ClienteDAO;
import Controle.FornecedorDAO;
import Modelo.Cliente;
import Modelo.Fornecedor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class TelaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeCompleto;
	private JTextField textCPF;
	private JTextField textTelefone;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCliente frame = new TelaCliente();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCliente() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2216, 1104);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(61, 272, 242, 39);
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				
				
				ClienteDAO clienteDao = ClienteDAO.getinstancia();
				
				 if (textNomeCompleto.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Nome não preenchido!!");
					 return;
			        }
				 else {
					 cliente.setNomeEmpressa(textNomeCompleto.getText());
				 }
				
				 if (textCPF.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "CPF não preenchido!!");
					 return;
				 }
				 else {
				cliente.setCpf(Long.valueOf(textCPF.getText()));
				 }
				 
				 if (textTelefone.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Telefone não preenchido!!");
					 return;
				 }
				 else {
				cliente.setTelefone(Long.valueOf(textTelefone.getText()));
				 }
				
				
				if(clienteDao.Inserir(cliente)==true) {
					JOptionPane.showMessageDialog(null, "Boa");
				}else {
					JOptionPane.showMessageDialog(null, "Deu não");
				}
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Listar");
		btnNewButton_1.setBounds(61, 335, 242, 39);
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setBounds(4, 9, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaSelecao ts = new TelaSelecao();
				ts.setExtendedState(JFrame.MAXIMIZED_BOTH);
				ts.setVisible(true);	
			}
		});
		contentPane.add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(380, 35, 506, 45);
		panel.setBackground(new Color(211, 211, 211));
		panel.setToolTipText("");
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome Completo:");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 176, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		
		textNomeCompleto = new JTextField();
		textNomeCompleto.setBounds(177, 11, 319, 23);
		panel.add(textNomeCompleto);
		textNomeCompleto.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1048, 35, 506, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setToolTipText("");
		panel_1.setBackground(new Color(211, 211, 211));
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setForeground(Color.BLACK);
		lblCpf.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblCpf.setBackground(Color.BLACK);
		lblCpf.setBounds(75, 6, 64, 25);
		panel_1.add(lblCpf);
		
		textCPF = new JTextField();
		textCPF.setBounds(179, 9, 317, 25);
		panel_1.add(textCPF);
		textCPF.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(380, 107, 506, 45);
		panel_2.setLayout(null);
		panel_2.setToolTipText("");
		panel_2.setBackground(new Color(211, 211, 211));
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Data De Nascimento:");
		lblNewLabel_2.setBounds(10, 11, 191, 25);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(198, 11, 62, 25);
		panel_2.add(comboBox_1);
		comboBox_1.addItem("01");
		comboBox_1.addItem("02");
		comboBox_1.addItem("03");
		comboBox_1.addItem("04");
		comboBox_1.addItem("05");
		comboBox_1.addItem("06");
		comboBox_1.addItem("07");
		comboBox_1.addItem("08");
		comboBox_1.addItem("09");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		comboBox_1.addItem("12");
		comboBox_1.addItem("13");
		comboBox_1.addItem("14");
		comboBox_1.addItem("15");
		comboBox_1.addItem("16");
		comboBox_1.addItem("17");
		comboBox_1.addItem("18");
		comboBox_1.addItem("19");
		comboBox_1.addItem("20");
		comboBox_1.addItem("21");
		comboBox_1.addItem("22");
		comboBox_1.addItem("23");
		comboBox_1.addItem("24");
		comboBox_1.addItem("25");
		comboBox_1.addItem("26");
		comboBox_1.addItem("27");
		comboBox_1.addItem("28");
		comboBox_1.addItem("29");
		comboBox_1.addItem("30");
		comboBox_1.addItem("31");
		
		JComboBox cbMes = new JComboBox();
		cbMes.setBounds(309, 11, 59, 25);
		panel_2.add(cbMes);
		cbMes.addItem("01");
		cbMes.addItem("02");
		cbMes.addItem("03");
		cbMes.addItem("04");
		cbMes.addItem("05");
		cbMes.addItem("06");
		cbMes.addItem("07");
		cbMes.addItem("08");
		cbMes.addItem("09");
		cbMes.addItem("10");
		cbMes.addItem("11");
		cbMes.addItem("12");
		
		
		JLabel lblNewLabel_5 = new JLabel("Mês");
		lblNewLabel_5.setBounds(270, 8, 47, 27);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_5.setForeground(new Color(0, 128, 128));
		
		JLabel lblNewLabel_6 = new JLabel("Ano");
		lblNewLabel_6.setBounds(378, 10, 47, 22);
		panel_2.add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_6.setForeground(new Color(0, 128, 128));
		
		JComboBox cbAno = new JComboBox();
		cbAno.setBounds(415, 11, 81, 25);
		panel_2.add(cbAno);
		cbAno.addItem("2000");
		cbAno.addItem("2001");
		cbAno.addItem("2002");
		cbAno.addItem("2003");
		cbAno.addItem("2004");
		cbAno.addItem("2005");
		cbAno.addItem("2006");
		cbAno.addItem("2007");
		cbAno.addItem("2008");
		cbAno.addItem("2009");
		cbAno.addItem("2010");
		cbAno.addItem("2011");
		cbAno.addItem("2012");
		cbAno.addItem("2013");
		cbAno.addItem("2014");
		cbAno.addItem("2015");
		cbAno.addItem("2016");
		cbAno.addItem("2017");
		cbAno.addItem("2018");
		cbAno.addItem("2019");
		cbAno.addItem("2020");
		cbAno.addItem("2021");
		cbAno.addItem("2022");
		cbAno.addItem("2023");
		
		
		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setBounds(168, 12, 33, 22);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 17));
		lblNewLabel_4.setForeground(new Color(0, 128, 128));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(1048, 107, 506, 45);
		panel_1_1.setLayout(null);
		panel_1_1.setToolTipText("");
		panel_1_1.setBackground(new Color(211, 211, 211));
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Numero de Telefone:");
		lblNewLabel_3.setBounds(10, 11, 156, 23);
		panel_1_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		
		textTelefone = new JTextField();
		textTelefone.setBounds(179, 11, 317, 23);
		panel_1_1.add(textTelefone);
		textTelefone.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(380, 218, 1461, 772);
		contentPane.add(panel_3);
		
		table = new JTable();
		panel_3.add(table);
		
		JLabel lblFundoDeTela = new JLabel("New label");
		lblFundoDeTela.setIcon(new ImageIcon(TelaCliente.class.getResource("/imgs/FundoDeTela.jpg")));
		lblFundoDeTela.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblFundoDeTela);
	}
}
