import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image = new ImageIcon("mypic1.jpg");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel();
		label.setText("My First Attempt in Java Swing");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0xFFCC99));
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		label.setIconTextGap(20);
		label.setBackground(Color.BLACK);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100,150,450,450);//location and size of label
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);//use to set exact coordinates of label/text
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		


	}

}
