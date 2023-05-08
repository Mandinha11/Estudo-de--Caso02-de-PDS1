package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaVendas extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas frame = new TelaVendas();
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2015, 1092);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKartVendido = new JLabel("Kart Vendido:");
		lblKartVendido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKartVendido.setBounds(281, 119, 102, 24);
		contentPane.add(lblKartVendido);
		
		JLabel lblComprador = new JLabel("Nome Do Comprador:");
		lblComprador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblComprador.setBounds(780, 121, 158, 20);
		contentPane.add(lblComprador);
		
		JLabel lblNewLabel = new JLabel("Valor Da Venda:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(1391, 119, 121, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(1522, 120, 304, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(393, 119, 304, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(948, 120, 304, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(281, 187, 1588, 807);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(51, 187, 167, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir");
		btnNewButton_1.setBounds(51, 268, 167, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Voltar");
		btnNewButton_2.setBounds(10, 11, 121, 28);
		contentPane.add(btnNewButton_2);
		
		JLabel lblTeleDeFundo = new JLabel("");
		lblTeleDeFundo.setIcon(new ImageIcon(TelaVendas.class.getResource("/imgs/FundoDeTela.jpg")));
		lblTeleDeFundo.setBounds(0, 0, 1924, 1053);
		contentPane.add(lblTeleDeFundo);
	}
}
