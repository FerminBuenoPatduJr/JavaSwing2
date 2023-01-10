import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame{
	
	MyFrame(){

		
		//this
		this.setVisible(true);
		this.setSize(420,420);
		this.setTitle("This title goes here");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//logo setting
		ImageIcon image = new ImageIcon("logo.png");
		this.setIconImage(image.getImage());
		
		//bg color
		//this.getContentPane().setBackground(Color.green); //setting specific color
		//this.getContentPane().setBackground(new Color(204,204,204));
		this.getContentPane().setBackground(new Color(0x003366));
		
	}
	

}
