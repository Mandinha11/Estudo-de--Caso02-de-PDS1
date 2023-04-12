package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Fornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor frame = new Fornecedor();
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
	public Fornecedor() {
		setTitle("Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 715);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome da empresa:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(274, 206, 156, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCpf.setBounds(386, 261, 44, 28);
		contentPane.add(lblCpf);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCnpj.setBounds(372, 328, 58, 28);
		contentPane.add(lblCnpj);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTelefone.setBounds(347, 400, 156, 28);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(440, 205, 264, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(440, 268, 264, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(440, 335, 264, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(440, 407, 264, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(232, 569, 148, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atualizar");
		btnNewButton_1.setBounds(407, 569, 148, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Exluir");
		btnNewButton_1_1.setBounds(589, 569, 148, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Listar");
		btnNewButton_1_1_1.setBounds(767, 569, 148, 23);
		contentPane.add(btnNewButton_1_1_1);
	}
}
