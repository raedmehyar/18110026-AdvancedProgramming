package facDP;

public class Code {

	   public static void main(String[] args) {
	      File shapeFactory = new File();

	      //get an object of Circle and call its draw method.
	      Form shape1 = shapeFactory.getForm("GUI");

	      //call draw method of Circle
	      shape1.use();

	      //get an object of Rectangle and call its draw method.
	      Form shape2 = shapeFactory.getForm("CL");

	      //call draw method of Rectangle
	      shape2.use();

	   }
	}