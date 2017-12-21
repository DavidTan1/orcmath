package guiTeacher;

import java.util.List;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextArea mainField;

	public CatalogScreen(int width, int height) {
		super(width, height);

		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 258186143576427947L;

	public void initAllObjects(List<Visible> viewObjects) {

		Graphic david = new Graphic(100, 100, "resoucres/496443016.jpg");
		mainField = new TextArea(40, 40, 200, 40, "I want to wish you...");
		viewObjects.add(mainField);
		viewObjects.add(david);
		Button open = new Button(50, 50, 100, 30, "Switch", new Action() {

			@Override
			public void act() {
				CatalogMakerGUI.catalog.setScreen(CatalogMakerGUI.screen2);
			}
		});

		viewObjects.add(open);

	}

	
}