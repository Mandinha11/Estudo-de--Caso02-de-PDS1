package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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
		
		textField = new JTextField();
		textField.setBounds(177, 11, 319, 23);
		panel.add(textField);
		textField.setColumns(10);
		
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
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 9, 317, 25);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
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
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(309, 11, 59, 25);
		panel_2.add(comboBox_1_1);
		
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
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(415, 11, 81, 25);
		panel_2.add(comboBox_1_2);
		
		
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
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 11, 317, 23);
		panel_1_1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(380, 218, 1174, 672);
		contentPane.add(panel_3);
		
		JLabel lblFundoDeTela = new JLabel("New label");
		lblFundoDeTela.setIcon(new ImageIcon(TelaCliente.class.getResource("/imgs/FundoDeTela.jpg")));
		lblFundoDeTela.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblFundoDeTela);
	}
}
