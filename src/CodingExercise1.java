/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
String color = JOptionPane.showInputDialog("What color would you like the tortoise to draw?  You can pick from pink, blue, yellow, red or magenta.");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(color.equalsIgnoreCase("pink")){
			Tortoise.setPenColor(Color.PINK);
		}else if(color.equalsIgnoreCase("blue")){
			Tortoise.setPenColor(Color.BLUE);
		}else if(color.equalsIgnoreCase("yellow")){
			Tortoise.setPenColor(Color.YELLOW);
		}else if(color.equalsIgnoreCase("red")){
			Tortoise.setPenColor(Color.RED);
		}else if(color.equalsIgnoreCase("magenta")){
			Tortoise.setPenColor(Color.MAGENTA);
		}
		Tortoise.setSpeed(10);
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for (int i = 0; i < 720; i++) {
			Tortoise.move(1);
			Tortoise.turn(1);
		}
		
		Tortoise.penUp();
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.penDown();
		for (int i = 0; i < 90; i++) {
			Tortoise.move(1);
			Tortoise.turn(-2);
		}
		Tortoise.penUp();
		Tortoise.move(10);
		Tortoise.penDown();
		Tortoise.move(10);
		Tortoise.penUp();
		Tortoise.turn(180);
	for (int i = 0; i < 90; i++) {
		Tortoise.move(-1);
		Tortoise.turn(-2);
	}
	Tortoise.turn(180);
	Tortoise.penDown();
	Tortoise.move(10);
	Tortoise.penUp();
	Tortoise.turn(90);
	Tortoise.move(100);
	
	
	}
}
