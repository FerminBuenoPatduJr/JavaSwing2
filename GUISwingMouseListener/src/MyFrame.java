
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
//		this.setLayout(new FlowLayout());
//		this.pack();
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		
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
		System.out.println("You pressed the mouse!");
		label.setBackground(Color.blue);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You released the mouse!");
		label.setBackground(Color.yellow);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You entered the component.");
		label.setBackground(Color.gray);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You exited the component.");
		label.setBackground(Color.orange);
		
	}

}