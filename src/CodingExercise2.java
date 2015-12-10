/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	
	
	int currentYear = 2015;
	String age = JOptionPane.showInputDialog("What is your age?");
	int ageInt = Integer.parseInt(age);
	int yearBorn = currentYear - ageInt;
	JOptionPane.showMessageDialog(null, "You were born in " + yearBorn + ", then.");
	if(ageInt >= 30){
		JOptionPane.showMessageDialog(null, "You are too old to play this game.");
	}
	
}
}