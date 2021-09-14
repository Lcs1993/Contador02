import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Contador02 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contador02 window = new Contador02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Contador02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contagem");
		lblNewLabel.setBounds(24, 30, 61, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContador = new JLabel("");
		lblContador.setEnabled(false);
		lblContador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContador.setBounds(95, 30, 303, 14);
		frame.getContentPane().add(lblContador);
		
		JButton btnContar = new JButton("Contar");
		btnContar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cc=1;
				String contagem = "" ;
				while (cc<=10) {
					contagem +=cc+" ";
					cc++;
				}
				lblContador.setText(contagem);
			}
		});
		btnContar.setBounds(128, 100, 89, 23);
		frame.getContentPane().add(btnContar);
	}
}
