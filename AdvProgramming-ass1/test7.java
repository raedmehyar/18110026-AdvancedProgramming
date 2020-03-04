
public class test7 {
	public static void main(String[] args) {
		// See the difference between A and B
		// A- Wrong Answer
		int sum1 = 0;
		int i = 0;
		while (i <= 100) {
			i++;
			sum1 = sum1 + i;
		}
		System.out.println("The addition of numbers between 0 and 101 is: "+sum1);

		// B- Right Answer
		int sum2 = 0;
		int n = 0;
		while (n < 100) {
			n++;
			sum2 = sum2 + n;
		}
		System.out.println("The addition of numbers between 0 and 100 is: "+sum2);
	}
}
