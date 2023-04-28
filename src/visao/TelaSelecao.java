package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;

public class TelaSelecao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSelecao max = new TelaSelecao();
					max.setExtendedState(JFrame.MAXIMIZED_BOTH);
					max.setVisible(true);
					
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
		contentPane.setBackground(new Color(51, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFornecedor = new JButton("Fornecedor");
		btnFornecedor.setBackground(UIManager.getColor("Button.background"));
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaFornecedor tf = new TelaFornecedor();
				tf.setExtendedState(JFrame.MAXIMIZED_BOTH);
				tf.setVisible(true);
			}
		});
		btnFornecedor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnFornecedor.setBounds(619, 310, 264, 23);
		contentPane.add(btnFornecedor);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaCliente tc = new TelaCliente();
				tc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				tc.setVisible(true);
			}
		});
		btnCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnCliente.setBounds(619, 392, 264, 23);
		contentPane.add(btnCliente);
		
		JButton btnKarts = new JButton("Karts");
		btnKarts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			TelaKarts tk = new TelaKarts();
			tk.setExtendedState(JFrame.MAXIMIZED_BOTH);
			tk.setVisible(true);
			
			}
		});
		btnKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnKarts.setBounds(619, 462, 264, 23);
		contentPane.add(btnKarts);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				//TelaVendas tv = new TelaVendas();
				//tv.setVisible(true);
			}
		});
		btnVendas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnVendas.setBounds(619, 542, 264, 23);
		contentPane.add(btnVendas);
	}
}
