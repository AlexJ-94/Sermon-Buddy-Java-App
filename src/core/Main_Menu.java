package core;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_Menu {
	//Declare variables
	JFrame Frame_Main_Menu = new JFrame();
	JLabel StartLbl = new JLabel("Let's Get Started!");
	JButton Btn_Access_Sermon = new JButton("Access Sermon");
	JButton Btn_Build_Sermon = new JButton("Build Sermon");
	
	//Initialize and watch for press of the buttons
	public Main_Menu() {
		initialize();
		
		Btn_Build_Sermon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Build_Sermon New_Sermon = new Build_Sermon();
				Frame_Main_Menu.dispose();
			}
		});
	}

	//Build the Main Menu frame and add all objects to it
	private void initialize() {
		Frame_Main_Menu.setBounds(100, 100, 500, 415);
		Frame_Main_Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame_Main_Menu.getContentPane().setLayout(null);
		Frame_Main_Menu.setVisible(true);
		
		StartLbl.setFont(new Font("Tahoma", Font.PLAIN, 25));
		StartLbl.setBounds(130, 35, 200, 50);
		Frame_Main_Menu.getContentPane().add(StartLbl);
		
		Btn_Access_Sermon.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Btn_Access_Sermon.setBounds(50, 125, 375, 80);
		Frame_Main_Menu.getContentPane().add(Btn_Access_Sermon);
		
		Btn_Build_Sermon.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Btn_Build_Sermon.setBounds(50, 250, 375, 80);
		Frame_Main_Menu.getContentPane().add(Btn_Build_Sermon);

	}
	
}
