package sinDP;

public class Class {

	   //create an object of SingleObject
	   private static Class instance = new Class();

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private Class(){}

	   //Get the only object available
	   public static Class getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hey It's Raed!");
	   }
	}
//object