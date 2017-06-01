package core;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JButton;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel StartLbl = new JLabel("Let's Get Started!");
		StartLbl.setFont(new Font("Tahoma", Font.PLAIN, 25));
		StartLbl.setBounds(130, 35, 200, 50);
		frame.getContentPane().add(StartLbl);
		
		JButton Access_Sermon = new JButton("Access Sermon");
		Access_Sermon.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Access_Sermon.setBounds(50, 125, 375, 80);
		frame.getContentPane().add(Access_Sermon);
		
		JButton Build_Sermon = new JButton("Build Sermon");
		Build_Sermon.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Build_Sermon.setBounds(50, 250, 375, 80);
		frame.getContentPane().add(Build_Sermon);

	}
}
