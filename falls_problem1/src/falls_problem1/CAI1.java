package falls_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
	
	
	public static int userNum,correctNum;
	
	public static void main(String[] args) {
		
		
		//initiate the program by going to quizzing to user
		quiz();
		
		
		//gather what the user thinks the input is
		//readResponse();
		
		
		//compare the user input to the correct answer and print results
		//isAnswerCorrect();
		
		
	}
	
		
	




public static void quiz() {
	
	
	askQuestion();
	readResponse();
	isAnswerCorrect();
	
	
}


public static int askQuestion() {
	
	//to get random number, first create the object
	
	SecureRandom randomnumber = new SecureRandom();
	
	//get the random numbers
	
	int randoNum1 = randomnumber.nextInt(10);
	
	int randoNum2 = randomnumber.nextInt(10);
	
	
	//ask the question
	
	System.out.println("How much is "+randoNum1+ " times "+randoNum2+"?");
	
	//make sure the correct answer can be prepared for later
	
	correctNum = randoNum1 * randoNum2;
	
	return randoNum1 * randoNum2;
	
	
}

public static void readResponse() {
	
//see what the user says
	
	Scanner userInput = new Scanner(System.in);
	
	userNum = userInput.nextInt();
	

	
	
	
	
}

public static void isAnswerCorrect() {
	
	
	//check to see if their answer matches up to be correct
	
	if (userNum==correctNum) {
		//print feedback
    displayCorrectResponse();
		
		
	}
	
	else displayIncorrectResponse();
	
	
	
}

public static void displayCorrectResponse() {
	//print feedback
	System.out.println("Very Good!");
	
}


public static void displayIncorrectResponse() {
	
	//print feedback
	System.out.println("Incorrect");
	
	//ask again until the user answers correctly.
	
	quiz();
	//readResponse();
	//isAnswerCorrect();
	
	
}









}