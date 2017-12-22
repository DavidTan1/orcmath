package guiTeacher;

import java.awt.Graphics2D;


import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.MovingComponent;

public class Santa extends MovingComponent {


	AnimatedComponent santa;

	
	public Santa(int x, int y, int w, int h) {
		super(x, y, w, h);

		
		santa = new AnimatedComponent(450, 470, 61, 83);
		santa.addSequence("resources/santa.jpg", 150, 0, 108, 61, 83, 8);
		

		Thread run = new Thread(santa);
		run.start();


		Thread animation = new Thread(this);
		animation.start();

		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawImage(Graphics2D g) {
	}
}
