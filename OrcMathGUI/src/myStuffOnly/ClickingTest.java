package myStuffOnly;

import java.sql.Time;
import java.util.List;
import java.util.Timer;

import guiPlayer.CatalogScreen;
import guiTeacher.components.Button;
import guiTeacher.components.*;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ClickingTest extends FullFunctionScreen {

	TextArea results;
	TextArea timer;
	TextArea c;
	private int score;
	Button b;
	boolean start;
	boolean start1;
	boolean over;

	public ClickingTest(int width, int height) {
		super(width, height);
		score = 0;
		start = false;
		start1 = false;
		over = false;
		// TODO Auto-generated constructor stub
	}

	public void initAllObjects(List<Visible> viewObjects) {

		Timer time = new Timer();
		int sec = 5;

		b = new Button(0, 0, getWidth() / 2, getHeight() / 2, "Ready", new Action() {
			@Override
			public void act() {
				if (!start) {
					new Thread() {

						public void run() {
							try {
								start = true;
								c.setText("3");
								c.update();
								Thread.sleep(1000);
								c.setText("2");
								c.update();
								Thread.sleep(1000);
								c.setText("1");
								c.update();
								Thread.sleep(1000);
								Thread.sleep(1000);
								c.setText("GO");
								c.update();
								b.setText("CLICK ME");
								start1 = true;
								timer.setText("5");
								Thread.sleep(1000);
								timer.setText("4");
								Thread.sleep(1000);
								timer.setText("3");
								Thread.sleep(1000);
								timer.setText("2");
								Thread.sleep(1000);
								timer.setText("1");
								Thread.sleep(1000);
								timer.setText("0");
								b.setText("DONE");
								over = true;
							} catch (Exception E) {
								E.printStackTrace();
							}
						}
					}.start();
					;
				} else {
					if (!over && start1) {
						score++;
						results.setText("Score: " + score);
					}
				}
			}
		});
		viewObjects.add(b);

		results = new TextArea(50, 50, 100, 100, "Score: " + score);

		viewObjects.add(results);

		c = new TextArea(10, 10, 50, 50, " ");
		viewObjects.add(c);

		timer = new TextArea(70, 20, 50, 50, "");
		viewObjects.add(timer);

	}

}
