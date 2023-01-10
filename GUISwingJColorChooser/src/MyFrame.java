import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text.");
		label.setFont(new Font("Arial", Font.PLAIN, 100));
		label.setOpaque(true);
		
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color... I guess.", Color.black);
		}
		
	}

}