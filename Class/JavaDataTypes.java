package Class;

public class JavaDataTypes {
	public static void main(String[] args) {

		byte a = 10;
		byte b = 100;
		byte c = 127;
//		byte d=  128; the positive limit
//		byte e= -129; the negative limit 
		byte f = -128;
		byte g = -127;
		System.out.println("Right way to do it:\n" + a + "\n" + b + "\n" + c + "\n" + f + "\n" + g + "\n");
		System.out.println("Wrong way to do it:\n" + a + b + c + f + g + "\n");
		System.out.println("Addition:\n");
		System.out.println(a + b);
		System.out.println(b + f);
		System.out.println("====================");
		short h= -32768;
		short i=  32767;
//		short k= -32769; the negative limit 
//		short j=  32768; the positive limit
		System.out.println(h +"\n" + i);
		System.out.println("====================");
		int l= 214783647;
		int m= -214783648;
//		int n=  214783648; the positive limit
//		int o= -214783649; the negative limit
		System.out.println(l +"\n" + m);
		System.out.println("====================");
//		byte p= 100.5;
//		short q= 100.6;
//		int r= 100.7;
//   	long s= 100.7;
		float t= 100.7f;
		double u= 100.7;
		System.out.println(t +"\n" + u);
		System.out.println("====================");
		char v= 'A';
		char w= 'a';
		char W= 'B';
		char w1= 'b';
		boolean x= true;
		boolean y= false;
//		boolean z= False;
		System.out.println(v +"\n" + w +"\n" + W +"\n" + w1);
		System.out.println(x +"\n" + y);
		System.out.println("====================");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
	}
}
