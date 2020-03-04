import java.util.Scanner;

public class test5 {

	private static Scanner userInput;

	public static void main(String[] args) {
		System.out.println("Hello User, This is a program to evalute and print the greater value of 2 enterd values\n");
		userInput = new Scanner(System.in);
		System.out.print("Enter the First Value:");
		int num1 = userInput.nextInt();
		System.out.print("Enter the Second Value:");
		int num2 = userInput.nextInt();
		if (num1 > num2) {
			System.out.println("The greater value is: "+num1);
		} else {
			System.out.println("The greater value is: "+num2);
		}
	}
}