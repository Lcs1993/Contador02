import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Fatorial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fatorial window = new Fatorial();
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
	public Fatorial() {
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
		
		JSpinner txtN = new JSpinner();
		
		txtN.setModel(new SpinnerNumberModel(0, 0, 15, 1));
		txtN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtN.setBounds(28, 35, 40, 24);
		frame.getContentPane().add(txtN);
		
		JLabel lblNewLabel = new JLabel("! =");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(78, 38, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFat = new JLabel("1");
		lblFat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFat.setForeground(Color.RED);
		lblFat.setBounds(113, 32, 311, 31);
		frame.getContentPane().add(lblFat);
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int n=Integer.parseInt(txtN.getValue().toString());
				int f=1;
				int c=n;
				String resultado = Integer.toString(c);
				
				while (c>=1) {
					f*=c;
					
					c--;
					if (c>0) {
						
						resultado+="X"+c;
					}
				}
				
				lblFat.setText(resultado+" = "+Integer.toString(f));
			}
		});
	}
}
