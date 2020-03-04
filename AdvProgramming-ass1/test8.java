import java.util.Scanner;

public class test8 {

	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		String choice = userInput.next();
		if (choice.equals("end")) {
			System.out.println("Status: Program Terminated");
			System.exit(0);
		} else {
			char c = userInput.next().charAt(0);
			int num1 = userInput.nextInt();
			int num2 = userInput.nextInt();
			switch (c) {
			case '+':
				// Addition
				int sum = num1 + num2;
				System.out.println(sum);
				break;
			case '-':
				// Subtraction
				int sub = num1 - num2;
				System.out.println(sub);
				break;
			case '*':
				// Multiplication
				int multiply = num1 * num2;
				System.out.println(multiply);
				break;
			case '/':
				// Division
				int over = num1 / num2;
				System.out.println(over);
				break;
			case '%':
				// Modulus
				int mod = num1 % num2;
				System.out.println(mod);
				break;
			default:
				System.out.println("Error: review the operator used");
				break;
			}
		}
	}
}
