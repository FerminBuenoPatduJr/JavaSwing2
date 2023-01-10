
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	ImageIcon smile;
	ImageIcon dizzy;
	ImageIcon pain;
	ImageIcon nervous;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("smile.jpg");
		dizzy = new ImageIcon("dizzy.jpg");
		pain = new ImageIcon("pain.png");
		nervous = new ImageIcon("nervous.png");
		
		label.setIcon(smile);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		
		
		this.add(label);
//		this.setLayout(null);
//		this.setLayout(new FlowLayout());
		this.pack();
		this.setLocationRelativeTo(null);//this will make the frame appear on the middle of the screen
		
		
		//label = new JLabel();
		//label.setBounds(0, 0, 100, 100);
		//label.setBackground(Color.red);
	
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("You clicked the mouse!");
//		label.setBackground(Color.green);
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("You pressed the mouse!");
//		label.setBackground(Color.blue);
		label.setIcon(dizzy);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("You released the mouse!");
//		label.setBackground(Color.yellow);
		label.setIcon(pain);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("You entered the component.");
		//label.setBackground(Color.gray);
		label.setIcon(nervous);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("You exited the component.");
		//label.setBackground(Color.orange);
		label.setIcon(smile);
		
	}

}