import java.util.ArrayList;

public class SimpleDotComGame {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		ArrayList<String> locations = null;
		locations.add("4");
		locations.add("5");
		locations.add("6");
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive == true) {
			String guess = helper.getUserInput("enter a number");
			String result = theDotCom.checkYourSelf(guess);
			numOfGuesses++;
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("You took "+numOfGuesses+" guesses");
			}
		}
	}

}
