import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houses {
static Robot rob = new Robot();

	public static void main(String[] args) {
		
		// TODO Auto-generated method stu
		 Random rand = new Random();
		 rob.miniaturize();
			rob.setSpeed(200);
			rob.penDown();
			rob.setX(50);
			rob.setY(500);
for (int i = 0; i < 10; i++) {
	

String height =	 JOptionPane.showInputDialog("Choose a size(small,medium,or large)");
	if(height.equals("large")) {
		drawFlatRoof(height,Color.BLUE);
	}
	else {
		drawPointyRoof(height,Color.RED);	
	}
}
	rob.miniaturize();
		rob.setSpeed(200);
		rob.penDown();
		rob.setX(50);
		rob.setY(500);
		
			
	
	
	}
	public static void drawPointyRoof(String height,Color c ) {
		if(height.equals("small")) {
			rob.setPenColor(c);
			rob.move(60);
			rob.setAngle(45);
			rob.move(20);
			rob.setAngle(135);
			rob.move(20);
			rob.setAngle(180);
			rob.move(60);
			rob.setAngle(90);
			rob.setPenColor(Color.GREEN);
			rob.move(50);
			rob.setAngle(360);
		}
		else if(height.equals("medium")) {
			rob.setPenColor(c);
			rob.move(120);
			rob.setAngle(45);
			rob.move(20);
			rob.setAngle(135);
			rob.move(20);
			rob.setAngle(180);
			rob.move(120);
			rob.setAngle(90);
			rob.setPenColor(Color.GREEN);
			rob.move(50);
			rob.setAngle(360);
		}

	}
public static void drawFlatRoof(String height, Color c) {
	
		rob.setPenColor(c);
		rob.move(250);
		rob.setAngle(90);
		rob.move(20);
		rob.setAngle(180);
		rob.move(250);
		rob.setAngle(90);
		rob.setPenColor(Color.GREEN);
		rob.move(50);
		rob.setAngle(360);
	
}
}
