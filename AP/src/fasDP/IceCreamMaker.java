package fasDP;

public class IceCreamMaker{
	   private static IceCream BlueBerrries;
	   private static IceCream Chocolate;
	   private static IceCream Rasberries;

	   public IceCreamMaker() {
		   BlueBerrries = new BlueBerrries();
		   Chocolate = new Chocolate();
		   Rasberries = new Rasberries();
	   }

	   public static void drawCircle(){
		   BlueBerrries.draw();
	   }
	   public static void drawRectangle(){
		   Chocolate.draw();
	   }
	   public static void drawSquare(){
		   Rasberries.draw();
	   }
	}