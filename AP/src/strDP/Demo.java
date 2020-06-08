package strDP;

public class Demo {
	public static void main(String[] args) {
		Context context = new Context(new Concrete1());
		System.out.println("19 + 20 = " + context.executeStrategy(19, 20));

		context = new Context(new Concrete2());
		System.out.println("154 - 8 = " + context.executeStrategy(154, 8));
	}
}