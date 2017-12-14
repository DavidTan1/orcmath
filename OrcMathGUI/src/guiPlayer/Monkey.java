package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class Monkey extends Component{

	public Monkey(){
		super(40,20,230,50);
		
		update();
		
		// TODO Auto-generated constructor stub
	}




	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.fillRect(40,20,230,50);		
	}
	
}
