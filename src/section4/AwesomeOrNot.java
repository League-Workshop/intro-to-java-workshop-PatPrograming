package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int rnum = new Random().nextInt(4);
	// 3. Print out this variable
JOptionPane.showMessageDialog(null, rnum);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
if( rnum==0 ) {
	JOptionPane.showMessageDialog(null, "Awesome!");
	}
	// -- tell the user whatever they entered is awesome!
if( rnum==1 ) {
	JOptionPane.showMessageDialog(null, "Ok.");
	}
	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if( rnum==2 ) {
	JOptionPane.showMessageDialog(null, "Booorrrinngggg!!!");
	}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer
if( rnum==3 ) {
	JOptionPane.showMessageDialog(null, "( ͠° ͟ʖ ͡°)");
	}
}
}

