package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Scanner;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Monkey extends AnimatedComponent{

	private String name;
	private String type;
	private int level;
	private int price;
	Scanner in = new Scanner(System.in);
	
	
	public Monkey(String name, String type, int level, int price){
		
		this.name = name;
		this.type = type;
		this.level = level;
		this.price = price;
		
		super(40,40,100,100);
		
		//addSequence("resources/goku.png", 100, 0, 476, 60, 62, 13);
	
		//Thread Animation = new Thread(this);
		//Animation.start();
		update();
		
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return name + "," + type + "," + level + "," + price; 
	}
	

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		//g.setColor(Color.BLACK);
		//g.fillRect(400,200,230,500);		
		
		super.update(g);
	}
	
}
