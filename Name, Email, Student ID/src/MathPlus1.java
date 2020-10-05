import java.util.Scanner;

public class MathPlus1 {

	public static void main(String[] args) {
		
		int x, y;
		System.out.println("Enter a number and I will increase it by 1");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = x + 1;
		
		System.out.println(y);

	}

}
