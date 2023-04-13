package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class TelaSelecao extends JFrame {

	private JPanel contentPane;

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
	public TelaSelecao() {
		setTitle("Seleção");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 703);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecionar:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(495, 68, 138, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnFornecedor = new JButton("Fornecedor");
		btnFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFornecedor.setBounds(468, 138, 165, 23);
		contentPane.add(btnFornecedor);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCliente.setBounds(468, 202, 165, 23);
		contentPane.add(btnCliente);
		
		JButton btnKarts = new JButton("Karts");
		btnKarts.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnKarts.setBounds(468, 265, 165, 23);
		contentPane.add(btnKarts);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVendas.setBounds(468, 336, 165, 23);
		contentPane.add(btnVendas);
	}

}
