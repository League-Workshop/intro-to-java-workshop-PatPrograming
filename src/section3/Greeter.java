package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		System.out.println("Hello");
		String name=JOptionPane.showInputDialog("Please type your name");
		JOptionPane.showMessageDialog(null, "Greetings"+ name);
	}
}
