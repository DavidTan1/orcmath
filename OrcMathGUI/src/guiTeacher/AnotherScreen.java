package guiTeacher;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class AnotherScreen extends FullFunctionScreen {

	private TextArea mainField;
	private Button click;

	public AnotherScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 258186143576427947L;

	@Override

	public void initAllObjects(List<Visible> viewObjects) {

		mainField = new TextArea(40, 40, 200, 40, "Happy New Year!!!");
		viewObjects.add(mainField);

	}
}