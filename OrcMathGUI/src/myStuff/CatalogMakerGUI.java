package myStuff;

import java.util.List;

import guiTeacher.GUIApplication;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogMakerGUI extends GUIApplication {


	/**
	 * 
	 */
	private static final long serialVersionUID = -700104024045686291L;
	
	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		CatalogScreen a = new CatalogScreen(getWidth(),getHeight());
		setScreen(a);
	}
	public static void main(String[] args){
		CatalogMakerGUI sample = new CatalogMakerGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

}



		

		

