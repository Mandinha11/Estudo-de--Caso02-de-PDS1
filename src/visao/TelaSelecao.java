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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;

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
		
		//Icon logoPinkmanKart = new ImageIcon("imgs/PinkmanKartLogo.png");
		//JLabel lblLogoPinkmanKart = new JLabel("");
		//lblLogoPinkmanKart.setIcon(FundoDeTela);
	//	contentPane.add(lblFundoDeTela, "cell 2 1");
		
		setTitle("Seleção");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1940, 1075);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
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
		btnFornecedor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton btnKarts = new JButton("Karts");
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
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				//TelaVendas tv = new TelaVendas();
				//tv.setVisible(true);
			}
		});
		btnVendas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton btnCliente = new JButton("Cliente");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				TelaCliente tc = new TelaCliente();
				tc.setExtendedState(JFrame.MAXIMIZED_BOTH);
				tc.setVisible(true);
			}
		});
		btnCliente.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnKarts, 309, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnKarts, 556, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnKarts, 1047, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCliente, 367, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCliente, 556, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCliente, 1047, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnFornecedor, 427, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnFornecedor, 556, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnFornecedor, 1047, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnVendas, 488, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnVendas, 556, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnVendas, 1047, SpringLayout.WEST, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(btnVendas);
		contentPane.add(btnFornecedor);
		contentPane.add(btnCliente);
		contentPane.add(btnKarts);
	}
}
