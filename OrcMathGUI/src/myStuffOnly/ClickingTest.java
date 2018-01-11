package myStuffOnly;

import java.sql.Time;
import java.util.List;
import java.util.Timer;

import guiPlayer.CatalogScreen;
import guiTeacher.components.Button;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ClickingTest extends FullFunctionScreen{

	public int numPush;
	private TextArea results;
	private Button thebutton;
	private Button getPoints;
	private Button timerB;
	private TextArea timer;
	
	
	public ClickingTest(int width, int height) {
		super(width, height);
		numPush = 0;
		// TODO Auto-generated constructor stub
	}


	
	

	public void initAllObjects(List<Visible> viewObjects) {
		
		Timer time = new Timer();
		int sec = 5;
		
		timerB = new Button(350,350,100,100,"Start",new Action() {

			@Override
			public void act() {
				
				while(sec<5)
				{
					timer = new TextArea(300,300,50,50,"time left: "+sec);	
				}
				
				viewObjects.add(timer);
			}
			
			
			
		});
		viewObjects.add(timerB);
		
		
		
		
		
		
		
		getPoints = new Button(100,200,100,100,"Done",new Action() {
			public void act()
			{
				results = new TextArea(200,200,200,200,"Number of push: "+numPush);
				viewObjects.add(results);
			}
		});
		viewObjects.add(getPoints);
		
		thebutton = new Button(100,100,100,100,"Push Me",new Action() {
			public void act()
			{
				getPoints();
			}
			
		});
		viewObjects.add(thebutton);
	}
	

	public int getPoints()
	{
		numPush++;
		return numPush;
	}
	

}
