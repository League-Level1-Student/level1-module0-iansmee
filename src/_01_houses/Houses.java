package _01_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {Robot bob=new Robot();
	public void run() {

bob.setSpeed(100);
bob.setX(100);
bob.setY(500);
bob.penDown();
Color colour=Color.BLACK;
String color = JOptionPane.showInputDialog("what color would you like the house to be? (red, black, or blue)");

	if(color.equals("red")) {
		colour=Color.RED;
	}
	if(color.equals("blue")) {
			colour=Color.BLUE;
	}
	if(color.equals("black")) {
		colour=Color.BLACK;
	}

for (int i = 0; i < 10; i++) {
	

String height= JOptionPane.showInputDialog("How tall would you like the house to be?(small, medium, or large)");
	
drawhouse(height, colour);

}
	}
	private void drawhouse(String height, Color color) {
		// TODO Auto-generated method stub
		int Iheight=0;
		if(height.equals("large")) {
			Iheight=250;
		}
		if(height.equals("medium")) {
			Iheight=100;
		}
		if(height.equals("small")) {
			Iheight=60;
		}
		bob.penDown();
bob.turn(90);
bob.setPenColor(0,100,0);
bob.move(30);
bob.turn(270);
bob.setPenColor(color);
bob.move(Iheight);
if(height.equals("large")) {
	flatroof();
}
else {
	pointyroof();
}
bob.move(Iheight);
bob.turn(180);
	}
	void flatroof() {
		bob.turn(90);
		bob.move(30);
		bob.turn(90);
	}
	void pointyroof() {
		bob.turn(45);
		bob.move(30);
		bob.turn(90);
		bob.move(30);
		bob.turn(45);
	}
}
