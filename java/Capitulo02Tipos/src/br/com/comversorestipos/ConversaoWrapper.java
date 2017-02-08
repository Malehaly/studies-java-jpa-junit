package br.com.comversorestipos;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConversaoWrapper extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1909234346530653302L;

	private JLabel jLabel3 = new JLabel("0");

	private JTextField jTextField = new JTextField("");
	private JTextField jTextField2 = new JTextField("");
	private final JButton btnTotalVenda = new JButton("Total Venda");
	private final JLabel lblQuantidade = new JLabel("Quantidade:");
	private final JLabel lblPreo = new JLabel("Pre\u00E7o:");

	public ConversaoWrapper() {

		// Define o título da janela
		super("Exception");
		setTitle("Convers\u00E3o Wrapper Class");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.montaJanela();
	}

	private void montaJanela() {
		getContentPane().setLayout(null);
		jLabel3.setHorizontalAlignment(SwingConstants.LEFT);
		jLabel3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jLabel3.setBounds(140, 105, 254, 14);
		this.getContentPane().add(jLabel3);
		jTextField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jTextField.setBounds(122, 10, 128, 24);
		this.getContentPane().add(jTextField);
		jTextField2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jTextField2.setBounds(123, 45, 128, 29);
		this.getContentPane().add(jTextField2);
		btnTotalVenda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTotalVenda.setBounds(282, 26, 128, 23);

		btnTotalVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					String qtdVal = jTextField.getText();
					String prcVal = jTextField2.getText();
					int qtd = Integer.parseInt(qtdVal);
					float prc = Float.parseFloat(prcVal);

					float resultado = qtd * prc;

					jLabel3.setText(String.valueOf(resultado));
					jLabel3.setForeground(Color.BLACK);

				} catch (NumberFormatException e) {
					jLabel3.setText("Entrada Inválida. Digite valor valido ");
					jLabel3.setForeground(Color.RED);

				}

			}
		});

		getContentPane().add(btnTotalVenda);

		JLabel lblTotalVenda = new JLabel("Total Venda:");
		lblTotalVenda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalVenda.setBounds(32, 105, 88, 14);
		getContentPane().add(lblTotalVenda);
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidade.setBounds(32, 15, 80, 14);

		getContentPane().add(lblQuantidade);
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreo.setBounds(66, 52, 46, 14);

		getContentPane().add(lblPreo);

	}

	public static void main(String[] args) {
		ConversaoWrapper janela = new ConversaoWrapper();
		janela.setVisible(true);
		janela.setSize(640, 480);
		janela.getContentPane().setEnabled(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
