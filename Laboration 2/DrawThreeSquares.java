import se.lth.cs.pt.window.SimpleWindow;
import se.lth.cs.pt.square.Square;

public class DrawThreeSquares {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(600, 600, "DrawSquare");
		Square sq = new Square(250, 250, 100);
		//Kordinater där kvadraten ritas
		int oldX = 250;
		int oldY = 250;
		//Kordinator där musen klickan
		while (true){
			w.waitForMouseClick();
		int x = w.getMouseX();
		int y = w.getMouseY();
		//Avståndent från där kvadraten ritas till där musen klickar
		int distX = Math.abs(oldX - x);
		int distY = Math.abs(oldY - y);
		
		sq.draw(w);
		sq.move(distX, distY);
		}
	}
}
