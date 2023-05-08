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
		
		JButton btnFornecedor = new JButton("Fornecedor");
		btnFornecedor.setBounds(707, 502, 491, 35);
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
		
		JButton btnKarts = new JButton("Karts");
		btnKarts.setBounds(707, 389, 491, 35);
		btnKarts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			TelaKarts tk = new TelaKarts();
			tk.setExtendedState(JFrame.MAXIMIZED_BOTH);
			tk.setVisible(true);
			
			}
		});
		btnKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.setBounds(707, 559, 491, 35);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				//TelaVendas tv = new TelaVendas();
				//tv.setVisible(true);
			}
		});
		btnVendas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.setBounds(707, 446, 491, 35);
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaCliente tc = new TelaCliente();
				tc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				tc.setVisible(true);
			}
		});
		btnCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		contentPane.setLayout(null);
		contentPane.add(btnVendas);
		contentPane.add(btnFornecedor);
		contentPane.add(btnCliente);
		contentPane.add(btnKarts);
		
		JLabel lblFundoDeTela = new JLabel("");
		lblFundoDeTela.setIcon(new ImageIcon(TelaSelecao.class.getResource("/imgs/FundoDeTela.jpg")));
		lblFundoDeTela.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblFundoDeTela);
	}
}
