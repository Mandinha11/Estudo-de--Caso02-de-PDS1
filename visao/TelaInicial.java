package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField textLogin;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1056, 705);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel txtLog = new JLabel("Login:");
		txtLog.setBounds(430, 170, 51, 24);
		txtLog.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(txtLog);

		JLabel txtSe = new JLabel("Senha:");
		txtSe.setBounds(430, 281, 53, 24);
		txtSe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(txtSe);

		textLogin = new JTextField();
		textLogin.setBounds(549, 170, 221, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);

		textSenha = new JTextField();
		textSenha.setBounds(549, 285, 221, 20);
		textSenha.setColumns(10);
		contentPane.add(textSenha);

		JButton btnEntrar = new JButton("Logar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnEntrar.setBounds(549, 446, 221, 23);
		contentPane.add(btnEntrar);
	}
}
