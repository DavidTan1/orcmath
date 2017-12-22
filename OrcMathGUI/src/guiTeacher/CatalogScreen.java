package guiTeacher;

import java.awt.Color;
import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import com.itextpdf.text.Font;

import guiTeacher.components.Action;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {

	private TextArea mainField;	
	private static Color textColor;
	AnimatedComponent santa;

	public CatalogScreen(int width, int height) {
		super(width, height);

		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 258186143576427947L;
	public void initAllObjects(List<Visible> viewObjects) {

		
		
		
		Graphic david = new Graphic(0, 0, "resources/496443016.jpg");
		viewObjects.add(david);
		
		mainField = new TextArea(100, 100, 200, 40, "I want to wish you...");
		viewObjects.add(mainField);
		
		Color textColor = Color.green;
		
		mainField.setCustomTextColor(textColor);

		
		File fontFile = new File("resources//christmaseve.ttf");
		//Font font = Font.createFont(christmaseve.TRUETYPE_FONT, fontFile);

		
				
		santa = new AnimatedComponent(0, 0, 61, 83);
		santa.addSequence("resources/santa.jpg", 150, 0, 100, 50, 83, 8);
		

		Thread run = new Thread(santa);
		run.start();
		viewObjects.add(santa);

		
		Button open = new Button(50, 50, 100, 30, "Switch", new Action() {

			@Override
			public void act() {
				CatalogMakerGUI.catalog.setScreen(CatalogMakerGUI.screen2);
			}
		});

		viewObjects.add(open);

	}
	@Override
	public void setFile(File f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public JFrame getWindow() {
		// TODO Auto-generated method stub
		return null;
	}

	
}