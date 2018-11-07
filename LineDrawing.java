import java.awt.Color;

import se.lth.cs.pt.window.SimpleWindow;

public class LineDrawing {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(500, 500, "LineDrawing");
		w.moveTo(0, 0);
		while (true) {
			// vänta tills användaren klickar på en musknapp
			w.waitForMouseClick();
			int x = w.getMouseX();
			int y = w.getMouseY();
			// rita en linje till den punkt där användaren klickade

			w.setLineColor(Color.GREEN);
			w.setLineWidth(10);
			w.lineTo(x, y);
		}
	}
}
