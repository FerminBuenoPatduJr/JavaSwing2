import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JComboBox comboBox;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		
		//note: use wrapper classes to store primitive types. e.g.: Integer, Double, Float, etc.
		//see example below
		//Integer[] number = {1,2,3};
		String[] animals = {"dog", "cat", "bird","pig", "giraffe", "lion", "tiger"};
		
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		//comboBox.setEditable(true);//set to editable
		//System.out.println(comboBox.getItemCount());//get the total count of item/s
		//comboBox.addItem("horse");//add item to the drop-down
		//comboBox.insertItemAt("snake", 0);//insert item at specific index
		//comboBox.setSelectedIndex(0);//set selected item at specified index
		//comboBox.removeItem("cat");//remove specified item
		//comboBox.removeItemAt(0);//remove item at specified index
		//comboBox.removeAllItems();//remove all items
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());//get the value
			System.out.println(comboBox.getSelectedIndex());//get the index
		}
		
	}

}
