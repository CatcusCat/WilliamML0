import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {

		Robot sparky = new Robot();

		// 3. ask the user what color they would like the Robot to draw

		String colorPick = JOptionPane.showInputDialog("What color would you like to draw with (Any case is acceptable; Red, Green, or Blue)?");

		//put pen down
		
		sparky.penDown();
		
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)

		if (colorPick.equalsIgnoreCase("red")) {
			sparky.setPenColor(Color.RED);

		}

		else if (colorPick.equalsIgnoreCase("green")) {
			sparky.setPenColor(Color.GREEN);
			
		}

		else if (colorPick.equalsIgnoreCase("blue")){
			sparky.setPenColor(Color.BLUE);

		}
		
		else {
			sparky.setPenColor(Color.BLACK);
			
		}

		// 2. set the pen width to 10

		sparky.setPenWidth(10);

		// 1. make the Robot draw a shape

		for (int i = 0; i < 3; i++) {
			sparky.move(100);
			sparky.turn(120);
		}
	}
}
