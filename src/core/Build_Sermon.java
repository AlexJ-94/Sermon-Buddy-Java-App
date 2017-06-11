package core;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Build_Sermon {
	//Declare variables
	private JFrame Frame_Build_Sermon = new JFrame();
	private JTextArea Txt_Area_Build_Sermon = new JTextArea();
	private JButton Btn_Add_Blank = new JButton("Add Blank");
	private JButton Btn_Add_Verse = new JButton("Add Verse");
	private final JButton Btn_Save = new JButton("Save");
	private final JButton Btn_Exit = new JButton("Exit");
	
	//Initialize and watch for press of the buttons
	public Build_Sermon() {
		initialize();
		
		Btn_Add_Verse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Verse();
			}
		});
		
		Btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ExitCheck = 0;
				ExitCheck = JOptionPane.showConfirmDialog(null, "Are you sure you want to return to the main menu? Any unsaved progress will be lost");
				if (ExitCheck == 0) {
					Main_Menu Menu = new Main_Menu();
					Frame_Build_Sermon.dispose();
				}
			}
		});
	}

	//Build the Build Sermon frame and add all objects to it
	private void initialize() {
		Frame_Build_Sermon.setBounds(100, 100, 843, 467);
		Frame_Build_Sermon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame_Build_Sermon.getContentPane().setLayout(null);
		Frame_Build_Sermon.setVisible(true);
		
		Txt_Area_Build_Sermon.setBounds(28, 23, 758, 275);
		Frame_Build_Sermon.getContentPane().add(Txt_Area_Build_Sermon);
		
		Btn_Add_Blank.setBounds(27, 323, 165, 73);
		Frame_Build_Sermon.getContentPane().add(Btn_Add_Blank);
		
		Btn_Add_Verse.setBounds(225, 323, 165, 73);
		Frame_Build_Sermon.getContentPane().add(Btn_Add_Verse);
		
		Btn_Save.setBounds(424, 323, 165, 73);
		Frame_Build_Sermon.getContentPane().add(Btn_Save);

		Btn_Exit.setBounds(621, 323, 165, 73);
		Frame_Build_Sermon.getContentPane().add(Btn_Exit);
	}
	
	private void Add_Verse(){
		JOptionPane.showMessageDialog(null, "It Worked!");
	}
}
