package homeworkWeek3;

import java.util.Scanner;

public class postiveOrNegative {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Type a Number and I'll tell you if it's Postive or Negative.");
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		
		if(num >0) {
		System.out.println("Your Number is Positive!");
		}
		
		else {
			System.out.println("Your Number is Negative!");
		}
	}
}