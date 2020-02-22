package falls_problem1;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CAI5{
	
	
	public static int userNum, newcount,randoNum1,randoNum2, difficulty,problemtype;
	
	public static float quizscore, correctNum;
	
	public static void main(String[] args) {
		
		
		quiz();
		
		
	}
		
	




public static void quiz() {
	userNum=0;
	
int a = 0;
	correctNum=0;
	newcount=0;
	quizscore=0;
	
	readDifficulty();
	readProblemType();
	//generateQuestionArgument();
	int count=0;
	for (count=0; count<10;) {
	//difQuestion();
	askQuestion();
	readResponse();
	isAnswerCorrect();
	count++;
	}
	displayCompletionMessage();
	askformoreprob();
	
	
	
	
	
}

//changed to void
public static void askQuestion() {
	
	//to get random number, first create the object
	
	SecureRandom randomnumber = new SecureRandom();
	
	
	
	switch(difficulty) {
	
	case 1:  randoNum1 = randomnumber.nextInt(10);
	
	 randoNum2 = randomnumber.nextInt(10);
	 
	break;
	
	case 2 : 	 randoNum1 = randomnumber.nextInt(100);
	
	 randoNum2 = randomnumber.nextInt(100);
	 
	break;
	
	
	case 3 : 	 randoNum1 = randomnumber.nextInt(1000);
	
	 randoNum2 = randomnumber.nextInt(1000);
	break;
	
	case 4 : 	 randoNum1 = randomnumber.nextInt(10000);
	
	 randoNum2 = randomnumber.nextInt(10000);
	break;
	

	
	
	
	
	
	
	
	
	}
	
	//SecureRandom randomtype = new SecureRandom();
	//questiontype = randomtype.nextInt(4);
	
	
	
	
	
	
	 switch (problemtype) {
	
	
	case 1: System.out.println("How much is "+randoNum1+ " plus "+randoNum2+"?");
	correctNum = randoNum1 + randoNum2;
	// a = randoNum1 + randoNum2;
	break;
	
	
	case 2:  System.out.println("How much is "+randoNum1+ " times "+randoNum2+"?");
	correctNum=randoNum1*randoNum2;
	break;
	
	case 3:  System.out.println("How much is "+randoNum1+ " minus "+randoNum2+"?");
	correctNum=randoNum1-randoNum2;
	break;
	
	case 4:  System.out.println("How much is "+randoNum1+ " divided by "+randoNum2+"?");
	//divide by 0? Error...
	

	correctNum=(randoNum1/randoNum2);
	System.out.println(correctNum);

	
	// = Float.valueOf(decimalFormat.format(f));
	//correctNum = (float) (Math.round(correctNum*100) / 100.0);

	break;
	
	case 5: generateQuestionArgument();
	
	break;
	
	//a = randoNum1 * randoNum2;
	
	//get the random numbers
	}
	
	
	//System.out.println("How much is "+randoNum1+ " times "+randoNum2+"?");
	//return a;
	//return a;
	
	//make sure the correct answer can be prepared for later
	
	//correctNum = randoNum1 * randoNum2;
	
	//return randoNum1 * randoNum2;
	
	
}

public static void readResponse() {
	
//see what the user says
	
	Scanner userInput = new Scanner(System.in);
	
	userNum = userInput.nextInt();
		
	
	
}

public static void isAnswerCorrect() {
	
	

	
	if (userNum==correctNum) {
		
		quizscore++;
		//print feedback
    displayCorrectResponse();
		
		
	}
	
	else displayIncorrectResponse();
	
	
	
}

public static void displayCorrectResponse() {
	//print feedback
	
	SecureRandom randomFeedback = new SecureRandom();
	
	int randoCompliment = randomFeedback.nextInt(3);
	
	switch (randoCompliment) {
	
	case 0: System.out.println("Very Good!");
	break;
	        
	case 1: System.out.println("Excellent!");
	break;
	
	case 2: System.out.println("Nice Work!");
	break;
	
	case 3: System.out.println("Keep up the good work!");
	break;
	
	}
	

	
}


public static void displayIncorrectResponse() {
	

	
	
SecureRandom randomFeedback = new SecureRandom();
	
	int randoInsult = randomFeedback.nextInt(3);
	
	switch (randoInsult) {
	
	case 0: System.out.println("No. Please try again.");
	break;
	        
	case 1: System.out.println("Wrong. Try once more.");
	break;
	
	case 2: System.out.println("Don't give up!");
	break;
	
	case 3: System.out.println("No. Keep trying.");
	break;
	}
	
	
	
}



public static void displayCompletionMessage() {
	
	
	quizscore = quizscore/10*100;
	
	System.out.println("Your score is\t"+ quizscore);
	
	
	
	if (quizscore>=75.00) {
		
		System.out.println("Congratulations, you are ready to go to the next level!");
		
		
		
	} else System.out.println("Please ask your teacher for extra help.");
	
}


public static void askformoreprob() {
	
	System.out.println("Would you like to solve a new problem set?");
	
	char choice;
	
Scanner sc = new Scanner(System.in);
	
	choice = sc.next().charAt(0);
	
	if (choice == 'Y' ||choice== 'y') {
		//System.out.println("Success.");
		
		quiz();
		
	

		
	}  else 
		System.out.println("Goodbye!");
	System.exit(0);

}


	
public static void readDifficulty()
{
	
	System.out.println("Please enter difficulty: 1,2,3, or 4");
	
Scanner userInput = new Scanner(System.in);
	
	difficulty = userInput.nextInt();
	
	

	
	
	
	
}


public static void generateQuestionArgument() {
	
	
	SecureRandom randomtype = new SecureRandom();
	problemtype = randomtype.nextInt(5);
	
	
	switch(problemtype) {
	case 1: System.out.println("How much is "+randoNum1+ " plus "+randoNum2+"?");
	correctNum = randoNum1 + randoNum2;
	// a = randoNum1 + randoNum2;
	break;
	
	
	case 2:  System.out.println("How much is "+randoNum1+ " times "+randoNum2+"?");
	correctNum=randoNum1*randoNum2;
	break;
	
	case 3:  System.out.println("How much is "+randoNum1+ " minus "+randoNum2+"?");
	correctNum=randoNum1-randoNum2;
	break;
	
	case 4:  System.out.println("How much is "+randoNum1+ " divided by "+randoNum2+"?");
	//divide by 0? Error...
	

	correctNum=(randoNum1/randoNum2);
	System.out.println(correctNum);
	
	
	}
	
}


public static void readProblemType() {
	
	
	System.out.println("Enter a problem type:\n1.Addition\n2.Multiplication\n3.Subraction\n4.Division\n5.Suprise");
	
Scanner userInput = new Scanner(System.in);
	
	problemtype = userInput.nextInt();
	
	
	
} 
	
	
	
	



	
	
	
	
	





}

