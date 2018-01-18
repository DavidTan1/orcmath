package myStuffOnly;

import guiTeacher.GUIApplication;

public class ClickingTestGUI extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2096227758286178101L;

	public ClickingTestGUI(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ClickingTestGUI game = new ClickingTestGUI(500, 800);
		Thread runner = new Thread(game);
		runner.start();

	}

	@Override
	public void initScreen() {
		ClickingTest screen = new ClickingTest(getWidth(), getHeight());
		setScreen(screen);
	}

}
