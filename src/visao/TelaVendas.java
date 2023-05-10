package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.ClienteDAO;
import Controle.KartsDAO;
import Controle.VendasDAO;
import Modelo.Cliente;
import Modelo.Karts;
import Modelo.Vendas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTable;

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField txtData;
	private JTextField txtKart;
	private JTextField txtCliente;
	private JTextField txtPreco;
	private JTable table;

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
		
		table = new JTable();
		table.setToolTipText("");
		table.setFont(new Font("Tahoma", Font.PLAIN, 11));
		table.setBackground(new Color(0, 0, 0));
		panel.add(table);
		
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
		panel_1.setBounds(409, 31, 483, 55);
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
		panel_1_1.setBounds(409, 104, 483, 55);
		contentPane.add(panel_1_1);
		
		txtKart = new JTextField();
		txtKart.setColumns(10);
		txtKart.setBounds(153, 16, 304, 28);
		panel_1_1.add(txtKart);
		
		JLabel lblKartVendido = new JLabel("Kart Vendido:");
		lblKartVendido.setBounds(10, 16, 102, 24);
		panel_1_1.add(lblKartVendido);
		lblKartVendido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(211, 211, 211));
		panel_1_2.setBounds(1310, 31, 483, 55);
		contentPane.add(panel_1_2);
		
		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBounds(153, 16, 304, 28);
		panel_1_2.add(txtCliente);
		
		JLabel lblComprador = new JLabel("Cliente:");
		lblComprador.setBounds(10, 18, 86, 20);
		panel_1_2.add(lblComprador);
		lblComprador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBackground(new Color(211, 211, 211));
		panel_1_2_1.setBounds(1310, 104, 483, 55);
		contentPane.add(panel_1_2_1);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(153, 16, 304, 28);
		panel_1_2_1.add(txtPreco);
		
		JLabel lblNewLabel = new JLabel("Valor Da Venda:");
		lblNewLabel.setBounds(10, 16, 121, 24);
		panel_1_2_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(TelaVendas.class.getResource("/imgs/FundoDeTela.jpg")));
		lblNewLabel_1.setBounds(0, -4, 1952, 1057);
		contentPane.add(lblNewLabel_1);
	}
}
