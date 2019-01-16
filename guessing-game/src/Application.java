import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Random rng = new Random();
		int winNum = rng.nextInt(10) + 1;

		System.out.println("Please enter a number between 1 and 10");
		//using string since we aren't doing any math on it
		int userResponse = input.nextInt();
		System.out.println(userResponse);

		int count = 1;
		while (count < 3) {
			if(userResponse == winNum) {
				System.out.println("You Guessed Correct! You Win!");
				System.exit(0); //this will stop application
			} else if (userResponse > 10 || userResponse < 1){
				System.out.println("You guessed an invalid number. Game over");
				System.exit(0); 
			} else {
			} if (userResponse > winNum) {
				System.out.println("The number is lower than " + userResponse);
			} else {
				System.out.println("The number is higher than " + userResponse);

			}
			userResponse = input.nextInt();
			count ++;
		}
		System.out.println("Sorry You Lose");
	}

}


