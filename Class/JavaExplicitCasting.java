package Class;

public class JavaExplicitCasting {
public static void main(String[] args) {
	System.out.println("See the difference:");
	System.out.println("Unsafe:");
	unsafeExplicitCasting();
	System.out.println("Safe:");
	safeExplicitCasting();
}

private static void unsafeExplicitCasting() {
	int i=200;
	byte b=(byte)i;
	
	System.out.println(i);
	System.out.println(b);
}

private static void safeExplicitCasting() {
	int i=100;
	byte b=(byte)i;
	
	System.out.println(i);
	System.out.println(b);
}
}
