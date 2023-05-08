package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.ImageIcon;

public class TelaKarts extends JFrame {

	private JPanel contentPane;
	private JTextField textBuscarKarts;
	private JTextField textMarcaKart;
	private JTextField textAno;
	private JTextField textPreco;
	private JTextField textField;
	private JTextField textField_1;

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
		panel.setBounds(318, 247, 1536, 749);
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(318, 52, 424, 54);
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textMarcaKart = new JTextField();
		textMarcaKart.setBounds(130, 11, 262, 30);
		panel_1.add(textMarcaKart);
		textMarcaKart.setColumns(10);
		
		JLabel lblBuscarKarts = new JLabel("Cor:");
		lblBuscarKarts.setBounds(35, 11, 67, 30);
		panel_1.add(lblBuscarKarts);
		lblBuscarKarts.setForeground(new Color(0, 0, 0));
		lblBuscarKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(318, 138, 424, 54);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(20, 8, 104, 30);
		panel_1_1.add(lblQuantidade);
		lblQuantidade.setForeground(new Color(0, 0, 0));
		lblQuantidade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBounds(134, 11, 260, 30);
		panel_1_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(863, 52, 424, 54);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_1);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(36, 13, 59, 30);
		panel_1_1_1.add(lblAno);
		lblAno.setForeground(new Color(0, 0, 0));
		lblAno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		textPreco = new JTextField();
		textPreco.setBounds(130, 13, 261, 30);
		panel_1_1_1.add(textPreco);
		textPreco.setColumns(10);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(863, 138, 424, 54);
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_2);
		
		textBuscarKarts = new JTextField();
		textBuscarKarts.setBounds(131, 11, 261, 30);
		panel_1_1_2.add(textBuscarKarts);
		textBuscarKarts.setColumns(10);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(35, 8, 67, 30);
		panel_1_1_2.add(lblPreo);
		lblPreo.setForeground(new Color(0, 0, 0));
		lblPreo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBounds(1370, 138, 424, 54);
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_3);
		
		JLabel lblMarcaKarts = new JLabel("Marca:");
		lblMarcaKarts.setBounds(23, 11, 67, 30);
		panel_1_1_3.add(lblMarcaKarts);
		lblMarcaKarts.setForeground(new Color(0, 0, 0));
		lblMarcaKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		textAno = new JTextField();
		textAno.setBounds(135, 14, 259, 30);
		panel_1_1_3.add(textAno);
		textAno.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCadastrar.setBounds(45, 322, 227, 41);
		btnCadastrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(btnCadastrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(45, 247, 227, 41);
		btnListar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(btnListar);
		
		JPanel panel_1_1_3_1 = new JPanel();
		panel_1_1_3_1.setBounds(1370, 52, 424, 54);
		panel_1_1_3_1.setLayout(null);
		panel_1_1_3_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_3_1);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblModelo.setBounds(23, 11, 67, 30);
		panel_1_1_3_1.add(lblModelo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 14, 260, 30);
		panel_1_1_3_1.add(textField_1);
		
		JLabel lblTelaDoFundo = new JLabel("New label");
		lblTelaDoFundo.setIcon(new ImageIcon(TelaKarts.class.getResource("/imgs/FundoDeTela.jpg")));
		lblTelaDoFundo.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblTelaDoFundo);
	}
}
