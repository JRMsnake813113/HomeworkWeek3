package homeworkWeek3;

import java.util.Scanner;

public class greatestNumber {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Input the First Number:");
	int num1 = in.nextInt();
	
	System.out.println("Input the Second Number:");
	int num2 = in.nextInt();
	
	System.out.println("Input the Third Number:");
	int num3 = in.nextInt();
	
	if (num1 > num2)
		if (num1 > num3)
			System.out.println("The Greatest Number is " + num1);
	
	if (num2 > num1)
		if (num2 > num3)
			System.out.println("The Greatest Number is " + num2);
	
	if (num3 > num1)
		if (num3 > num2)
			System.out.println("The Greatest Number is " + num3);
	
	}
}
