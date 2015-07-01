package chap1.date;

import java.util.Date;

public class Main {
	public static void main(String args[]) {
		Game game = new Game(new Date(), new Date());
		game.showTime();
		game.getStartTime().setYear(79);
		
		game.showTime();
	}
}