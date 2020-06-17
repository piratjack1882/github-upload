package by.home.console.hello;

public class Hello {
	
	public static void main(String [] args) {
		System.out.println("Hello, master!");
		System.out.println("What do you want?");
		
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 15;
		int sum = calculator.sum(a, b);
		System.out.println("sum = " + sum);
		System.out.println("Well done!");

		a = 15;
		b = 25;
		int mul = calculator.mul(a, b);		
		System.out.println("mul = " + mul);
		System.out.println("Well done!");
	}
}
