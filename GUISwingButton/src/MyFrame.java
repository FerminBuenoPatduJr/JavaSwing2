import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
//public class MyFrame extends JFrame{
	
	JButton button;
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("thumbsup.png");
		ImageIcon icon2 = new ImageIcon("shock1.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(180, 150, 150, 150);
		label.setVisible(false);
		
		
		button = new JButton();
		button.setBounds(150,100,150,50);
		button.addActionListener(this);
		//button.addActionListener(e -> System.out.println("My name is Fermin")); //using lambda
		button.setText("I'm a button!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		button.setIconTextGap(-2);
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
	//	button.setEnabled(false);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			//System.out.println("Hi, my name is Fermin");
			//button.setEnabled(false);
			label.setVisible(true);
		}
		
	}
}


