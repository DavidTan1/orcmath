package guiTeacher;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import guiTeacher.AnotherScreen;
import guiTeacher.GUIApplication;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;
import guiTeacher.userInterfaces.Screen;

public class CatalogMakerGUI extends GUIApplication{

	/**
	 * 
	 */
	private static final long serialVersionUID = -700104024045686291L;
	public static CatalogMakerGUI catalog;
	public static CatalogScreen screen1;
	public static AnotherScreen screen2;
	AnimatedComponent santa;

	public CatalogMakerGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}



	@Override
	public void initScreen() {
		screen1 = new CatalogScreen(getWidth(), getHeight());
		screen2 = new AnotherScreen(getWidth(), getHeight());
		setScreen(screen1);

	}

	public static void main(String[] args) 
	{
		catalog = new CatalogMakerGUI(612, 408);
		Thread go = new Thread(catalog);
		go.start();
	}

	
}
	

