package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.UIManager;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpringLayout;
import java.awt.Panel;
import java.awt.Label;

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
		
		//Icon FundoDeTela = new ImageIcon("imgs/FundoDeTela.jpg");
		//JLabel lblFundoDeTela = new JLabel("");
		//lblFundoDeTela.setIcon(FundoDeTela);
		//contentPane.add(lblFundoDeTela, "cell 2 1");
		
		setTitle("Seleção");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2217, 1100);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicial ti = new TelaInicial();
				ti.setExtendedState(JFrame.MAXIMIZED_BOTH);
				ti.setVisible(true);
			}
		});
		btnVoltar.setBounds(30, 36, 89, 23);
		contentPane.add(btnVoltar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 176, 148));
		panel_1.setBounds(594, 228, 308, 214);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setForeground(new Color(0, 0, 0));
		btnCliente.setBounds(55, 91, 206, 46);
		panel_1.add(btnCliente);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaCliente tc = new TelaCliente();
				tc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				tc.setVisible(true);
			}
		});
		btnCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(47, 176, 148));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(1006, 228, 308, 214);
		contentPane.add(panel_1_1);
		
		JButton btnKarts = new JButton("Karts");
		btnKarts.setBounds(48, 88, 206, 46);
		panel_1_1.add(btnKarts);
		btnKarts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			TelaKarts tk = new TelaKarts();
			tk.setExtendedState(JFrame.MAXIMIZED_BOTH);
			tk.setVisible(true);
			
			}
		});
		btnKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(47, 176, 148));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(594, 517, 308, 229);
		contentPane.add(panel_1_2);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setBounds(48, 94, 206, 43);
		panel_1_2.add(btnVendas);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaVendas tv = new TelaVendas();
				tv.setExtendedState(JFrame.MAXIMIZED_BOTH);
				tv.setVisible(true);
				
	
				
				
			}
		});
		btnVendas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(47, 176, 148));
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(1006, 517, 308, 229);
		contentPane.add(panel_1_3);
		
		JButton btnFornecedor = new JButton("Fornecedor");
		btnFornecedor.setBounds(53, 93, 206, 47);
		panel_1_3.add(btnFornecedor);
		btnFornecedor.setBackground(UIManager.getColor("Button.background"));
		btnFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaFornecedor tf = new TelaFornecedor();
				tf.setExtendedState(JFrame.MAXIMIZED_BOTH);
				tf.setVisible(true);
			}
		});
		btnFornecedor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaSelecao.class.getResource("/imgs/FundoDeTela.jpg")));
		lblNewLabel.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblNewLabel);
	}
}
