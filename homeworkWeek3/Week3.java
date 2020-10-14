package lecture3;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are in main method");
		System.out.println("Now calling another method");
		
		multiplyNumbers();
		System.out.println("Now calling Subract method");
		int result = subtractNumbers();
		System.out.println("Result is "+result);
		
		int one,two;
		one = 5;
		two = 6;
		int sum = addNumbers(one,two);
		System.out.println("sum of one and two is "+sum);//11
		
	}
	
	public static int addNumbers(int x,int y) {// 5 6 x =5 y =6
		int one = 8,two=9;
		return x+y;//5+6
	}

	public static int multiplyNumbers(){
		int a,b;
		a=5;
		b=6;
		System.out.println(a*b);
		return a*b;
	}
	
	// Access Modifier - can be accessed outside or not public private protected - default
	// keyword called static - has something to do with objects and instances
	// void specifies the return type- void means it will not return anything
	
	public static int subtractNumbers(){
		int a = 6;
		int b=4;
		int c = a-b;
		return c;
		
	}
	
	
}
