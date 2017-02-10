import java.util.Scanner;

public class MathTestLab {
	static int answersRight = 0;
	static int answersWrong = 0;
	static int questions;
	static int answer;
	static Scanner sc = new Scanner(System.in);
															

	public static void main(String[] args) { // calculatedAnswer() is not called in the main method so we don't accidentally divide by zero
		promptNumQuestions();
		
	}

	public static void promptNumQuestions() { 
		System.out.print("How many questions do you want to be asked? (DON'T SAY 0 IT MESSES UP THE CODE) ");
		questions = sc.nextInt();
		if (questions == 0) {
			System.out.println("You are a waste of oxygen");
		}else if(questions!=0){ // Using an else if here so it doesn't go on to the next block of code and divide by 0 anyway
			askQuestions();
		}
		sc.nextLine();

	}

	public static void askQuestions() {
		for (int i = 0; i < questions; i++) {
			int num1 = (int) (20 * Math.random());
			int num2 = (int) (20 * Math.random());

			System.out.print("What is " + num1 + " + " + num2 + "? ");
			answer = sc.nextInt();
			sc.nextLine();
			if (answer == num1 + num2) {
				answersRight += 1;

			} else if (answer != num1 + num2) {
				answersWrong += 1;
			}

		}	
	calculatedAnswer();

	}

	public static void calculatedAnswer() {
		int grade = answersRight / questions * 100;
		System.out.println("Congratulations! You got " + answersRight + "/" + questions + " questions correct! Unfortunately, you got " + answersWrong + " questions wrong.");
		 
			System.out.print("Some super smart people have said that you got ");
		
if (grade <=100 && grade >=90) {
			System.out.print("an A, which means you're smart as hell. Good job, you special snowflake you!");
		}
        else if (grade <= 89 && grade >= 80) {
			System.out.print("a B, which means you're still pretty smart.");
		} else if (grade <= 79 && grade >= 70) {
			System.out.print("a C, which means you're pretty average. Maybe study more?");
		} else if (grade <= 69 && grade >= 60) {
			System.out.print("a D, which means you're stupid as hell. Jesus kid I don't know why I even deal with you.");

		} else if (grade <= 59 && grade >= 50 || grade < 50) {
			System.out.print("an F, which probably means you should crawl into a hole and die. Wow.");
		}
		

	}

}

public class whileLoopsSuck {
	
}
