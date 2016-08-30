import java.util.Random;

public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		
		int location1 = randInt.getRandom(2, 10);
		
		int[] locations = {location1, location1+1, location1+2};
		
		System.out.println(location1);

		dot.setLocationCells(locations);
		
		String userGuess =  "8";
		String result = dot.checkYourSelf(userGuess);
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}
}