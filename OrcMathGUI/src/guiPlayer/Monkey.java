package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Monkey extends AnimatedComponent{


	public Monkey(){
		
		super(40,40,57,69);
		
		addSequence("resource/goku.png", 150, 0, 469, 57, 69, 13);
	
		Thread Animation = new Thread(this);
		Animation.start();
		update();
		
		// TODO Auto-generated constructor stub
	}




	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		//g.setColor(Color.BLACK);
		//g.fillRect(400,200,230,500);		
		
		super.update(g);
	}
	
}
