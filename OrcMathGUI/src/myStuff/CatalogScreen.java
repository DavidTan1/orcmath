package myStuff;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen{

	private TextField mainField;
	private Button click;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 258186143576427947L;
	



	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		mainField = new TextField(40,40,200,30,"text goes here");
		viewObjects.add(mainField);
		
		mainField = new TextField(40,100,200,30,"text goes here");
		viewObjects.add(mainField);
		
		mainField = new TextField(40,200,200,30,"text goes here");
		viewObjects.add(mainField);
		
		mainField = new TextField(40,300,200,30,"text goes here");
		viewObjects.add(mainField);
		
		
		click = new Button(200,200,20,30,"Button",new Action() {
			
			@Override
			public void act() {
				mainField.setText("You click the button");				
			}
		});
	}
}