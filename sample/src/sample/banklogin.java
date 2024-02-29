package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class banklogin {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					banklogin window = new banklogin();
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
	public banklogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BANK LOGIN ");
		lblNewLabel.setBounds(131, 34, 89, 0);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel l = new JLabel("username");
		l.setBounds(56, 80, 89, 14);
		frame.getContentPane().add(l);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(56, 140, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(237, 77, 103, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(237, 137, 103, 20);
		frame.getContentPane().add(p1);
		homepage h1=new homepage();
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String password=p1.getText();
				if(user.equals("abc")  &&  password.equals("1234"))
				{
					h1.setVisible(true);
					frame.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "invalid user");
				}
					
					
			}
		});
		btnNewButton.setBounds(131, 196, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("BANK LOGIN");
		lblNewLabel_3.setBounds(141, 27, 79, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
