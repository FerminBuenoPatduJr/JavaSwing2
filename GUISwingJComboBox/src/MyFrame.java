import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog", "cat", "bird","pig", "giraffe", "lion", "tiger"};
		
		JComboBox comboBox = new JComboBox(animals);
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
