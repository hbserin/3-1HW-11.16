/**Name:Erin
 *Id:U10108079
 *Exercise:11.16
 */

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		//Creat an array list
		ArrayList<Integer> list = new ArrayList<>();

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + " + " + number2 + "? ");

		int answer;

		//Read a value from the input
		answer = input.nextInt();

		do{
			//Check whether the answer has entered or not
			if(!list.contains(answer)){
				 //Add the value if it is not in the list
				list.add(answer);
			}else{
				System.out.println("You already entered " + answer );
			}

			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer = input.nextInt();

		}while(number1 + number2 != answer);

		System.out.println("You got it!");
	}
}