package guessTheNumberGame;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberApp {

	public static void main(String[] args) {
		Random rand=new Random();
		int computer_selection=rand.nextInt(1, 100);

		int player_guess=0;
		int attempts=0;

		System.out.println("Welcome to the Guess the Number Game!");
		System.out.println("I have selected a random number between 1 and 100 \nTry to guess it!\n");
		guessTheNumberGame(computer_selection, player_guess, attempts);
		
	}
	public static void guessTheNumberGame(int computer_selection, int player_guess, int attempts) {
		Scanner scan = new Scanner(System.in);
		while(computer_selection!=player_guess)
		{
			System.out.print("Enter your guess: ");
			player_guess=scan.nextInt();
			attempts++;
			System.out.println();
			if(computer_selection==player_guess)
			{
				System.out.println("Congratulations! You guessed the number "+computer_selection+"! It took you "+attempts+" attempts.");
			}
			else if (player_guess<computer_selection)
			{
				System.out.println("Too low! Try again.");
			}
			else if (player_guess>computer_selection)
			{
				System.out.println("Too High! Try again.");
			}
		}
	}
}
