import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JOptionPane.showMessageDialog(null, "Plain Message", "Pamagat", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Information Message", "Pamagat", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Question Message", "Pamagat", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Warning Message", "Pamagat", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Error Message", "Pamagat", JOptionPane.ERROR_MESSAGE);
		
//		System.out.println(JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
//		int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		System.out.println(answer);
//		String name = JOptionPane.showInputDialog("What is your name?: ");
//		System.out.println("Hello " + name);
		
		String[] responses = {"No, you're awesome", "Thank you!", "*blush*"};
		
		ImageIcon icon = new ImageIcon("shock1.png");
		
		JOptionPane.showOptionDialog(null, "You are awesome!", "Secret Message", 
				JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses,
				0);
	}

}
