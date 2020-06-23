/****************************************************************************
 *
 * Created by: Chris Asante
 * Date : June 2020
 * Created for : ICS4U
 * Rock paper scissors
 *
 ****************************************************************************/
 import java.util.Scanner;
import java.util.Random;

public class RPS {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Random randGen = new Random();
		
		int comChoice = randGen.nextInt(3) + 1;
		
		int rock = 1, paper = 2, scissors = 3;
		
		System.out.print("Rock, Paper, Sissors! Choose Rock (1), Paper (2) Scissors (3) to play");
		
		int userChoice = userInput.nextInt();
		
		if(userChoice == 1 && comChoice == 2) {
			System.out.println("You chose rock. CPU chose paper. You lose :(");
		}
		else if(userChoice == 1 && comChoice == 3) {
			System.out.println("You chose rock. CPU chose scissors. You win :)");
		}
		
		else if(userChoice == 2 && comChoice == 3) {
			System.out.println("You chose paper. CPU chose scissors. You lose :(");
		}
		else if(userChoice == 2 && comChoice == 1) {
			System.out.println("You chose paper. CPU chose rock. You win :)");
		}

		else if(userChoice == 3 && comChoice == 1) {
			System.out.println("You chose scissors. CPU chose rock. You lose :(");
		}
		else if(userChoice == 3 && comChoice == 2) {
			System.out.println("You chose scissors. The computer chose paper. You win :)");			
		}
		
		else if(userChoice == comChoice) {
			System.out.println("You both chose the same move. Draw!");
		}
		else {
			System.out.println("Reset and only choose between 1, 2, 3!");
		}
	}
}