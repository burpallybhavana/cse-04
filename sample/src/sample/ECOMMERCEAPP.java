package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ECOMMERCEAPP {

	private JFrame frame;
	int items=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOMMERCEAPP window = new ECOMMERCEAPP();
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
	public ECOMMERCEAPP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(131, 11, 183, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l1 = new JLabel("CART ");
		l1.setBounds(306, 41, 103, 14);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\e3.jpg"));
		btnNewButton.setBounds(-62, -433, 257, 416);
		frame.getContentPane().add(btnNewButton);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+500;
				l1.setText("CART : "+items);
			   
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\e3.jpg"));
		b1.setBounds(22, 81, 112, 133);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+600;
				l1.setText("CART : "+items);
			}
			
		});
		
		b2.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\e4.jpg"));
		b2.setBounds(172, 81, 112, 133);
		frame.getContentPane().add(b2);
		
		JLabel lblNewLabel_1 = new JLabel("RS. 500/-");
		lblNewLabel_1.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel_1.setBounds(57, 236, 64, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RS. 600/-");
		lblNewLabel_2.setFont(new Font("Verdana", Font.ITALIC, 12));
		lblNewLabel_2.setBounds(192, 236, 64, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton b3 = new JButton("BUY");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b3, "no of items "+items+"\nBill "+bill);
			}
		});
		b3.setFont(new Font("Verdana", Font.ITALIC, 12));
		b3.setBounds(320, 227, 89, 23);
		frame.getContentPane().add(b3);
		
		
	}
}
