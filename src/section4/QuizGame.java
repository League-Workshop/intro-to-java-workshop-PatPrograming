package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=1;
		// 2.  Ask the user a question 
		String answer=JOptionPane.showInputDialog("How many fingers does a normal human have?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase("Ten.")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			}else {
				JOptionPane.showMessageDialog(null, "Wrong.");
			}
		// 4.  if the user's answer was correct, add one to their score 
		
			if(answer.equalsIgnoreCase("Ten.")) {
				score+= 1;
				
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer1=JOptionPane.showInputDialog("How many faces does a normal human have?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer1.equalsIgnoreCase("One.")) {
			JOptionPane.showMessageDialog(null, "Correct.");
			}else {
				JOptionPane.showMessageDialog(null, "Wrong.");
			}
		// 4.  if the user's answer was correct, add one to their score 
		
			if(answer1.equalsIgnoreCase("One.")) {
				score+= 1;
				
			String answer2=JOptionPane.showInputDialog("How many ears does a normal human have?");
			// 3.  Use an if statement to check if their answer is correct
			if(answer2.equalsIgnoreCase("Two.")) {
				JOptionPane.showMessageDialog(null, "Correct.");
				}else {
					JOptionPane.showMessageDialog(null, "Wrong.");
				}
			// 4.  if the user's answer was correct, add one to their score 
			
				if(answer1.equalsIgnoreCase("Two.")) {
					score+= 1;
					}
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, score);
	}
	}

