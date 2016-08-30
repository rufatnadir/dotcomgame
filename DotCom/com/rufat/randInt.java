

import java.util.Random;

public class randInt {

	
	private static int random(int min, int max) {
		
		Random rand = new Random();
		int randNum = rand.nextInt((max = min) + 1) + min;
		return randNum;
		
	}
	
	public static int getRandom(int min, int max) {
		return random(min, max);
	}
	
}
