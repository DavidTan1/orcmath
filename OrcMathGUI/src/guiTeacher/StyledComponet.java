package guiTeacher;

import java.awt.Color;

import com.itextpdf.text.Font;

import guiTeacher.components.Component;

public abstract class StyledComponet extends Component {



	 public StyledComponet(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	private static int tabHeight = 60;

	 private static Color tabColor = new Color(150,200,255);

	 private static Color tabShade = new Color(150,200,255);

	 private static boolean buttonOutline = false;

	 private static int buttonOutlineSize = 2;

	 private static Color textColor = Color.black;

	 private static Color headerColor = new Color(0,0,0);

	 private static Color bodyColor = new Color(0,0,0);

	 private static Color backgroundColor = new Color(255,255,255);

	 private static Color inactiveBorderColor = new Color(140,140,140);

	 private static Color alertColor = new Color(239,172,56);

	 private static Color activeBorderColor = new Color(0,0,0);

	 private static Color staticBorderColor = new Color(0,0,0);

	 private static Color accentColor = new Color(150,150,150);

	 private static Color highlightColor = new Color(200,200,240);

	 private static int animationTime = 600;//duration of transitions

}
