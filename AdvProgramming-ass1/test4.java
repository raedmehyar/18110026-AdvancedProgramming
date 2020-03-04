import java.util.Scanner;

public class test4 {

	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		int num1 = userInput.nextInt();
		int num2 = userInput.nextInt();
		int sum = num1 + num2;
		System.out.println(sum);

	}
}
