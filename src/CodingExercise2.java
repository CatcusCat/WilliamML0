
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {

	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old will you be on December 31, 2017?");

		int ageInt = Integer.parseInt(age);

		if (ageInt < 31) {
			JOptionPane.showMessageDialog(null, 2017 - ageInt);

		}

		else {
			JOptionPane.showMessageDialog(null, "You are too old to play this game!");

		}
	}
}
