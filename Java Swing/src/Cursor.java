// Java Program to apply some predefined and system cursors to components (label)
import java.awt.*;
import javax.swing.*;
class cursor extends JFrame {
	// frame
	static JFrame f;

	// label
	static Label l, l1, l2;

	// default constructor
	cursor()
	{
	}

	// main class
	public static void main(String args[])
	{
		try {
			// create a frame
			f = new JFrame("cursor");

			// create e panel
			JPanel p = new JPanel();

			// create labels
			l = new Label("label one");
			l1 = new Label("label two");
			l2 = new Label("label three");

			// create cursors
			Cursor c = new Cursor(CROSSHAIR_CURSOR);
			Cursor c1 = new Cursor(HAND_CURSOR);

			// get System cursor
			Cursor c2 = Cursor.getSystemCustomCursor("Invalid.32x32");

			// set cursor
			l.setCursor(c);
			l1.setCursor(c1);
			l2.setCursor(c2);

			// add labels to panel
			p.add(l);
			p.add(l1);
			p.add(l2);

			// add panel to the frame
			f.add(p);

			// show the frame
			f.show();
			f.setSize(250, 300);
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

