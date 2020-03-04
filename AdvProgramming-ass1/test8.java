import java.util.Scanner;

public class test8 {

	private static Scanner userInput;

	public static void main(String[] args) {
		System.out.println(
				"Hello User! This is a Calculator\n\nSupported Numbers are Integers\nSupported Operators are + - * / %\n\nTo continue the program type 'con'\nTo stop the program type 'end'\n..................................");
		userInput = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			System.out.print("\nContinue/End:");
			String choice = userInput.next();
			if (choice.equals("end")) {
				System.out.println("..................................\nStatus: Program Terminated");
				System.exit(0);
			} else {
				System.out.print("Operator:");
				char c = userInput.next().charAt(0);
				System.out.print("First Number:");
				int num1 = userInput.nextInt();
				System.out.print("Second Number:");
				int num2 = userInput.nextInt();
				switch (c) {
				case '+':
					// Addition
					int sum = num1 + num2;
					System.out.println("The result is:" + sum);
					break;
				case '-':
					// Subtraction
					int sub = num1 - num2;
					System.out.println("The result is:" + sub);
					break;
				case '*':
					// Multiplication
					int multiply = num1 * num2;
					System.out.println("The result is:" + multiply);
					break;
				case '/':
					// Division
					int over = num1 / num2;
					System.out.println("The result is:" + over);
					break;
				case '%':
					// Modulus
					int mod = num1 % num2;
					System.out.println("The result is:" + mod);
					break;
				default:
					System.out.println("Error: review the operator used");
					break;
				}
			}
		}
	}
}
