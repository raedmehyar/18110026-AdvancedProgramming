package SISF;

public class CodeCD {
	public static void main(String[] args) {
		File shapeFactory = new File();

		// get an object of Rectangle and call its draw method.
		Form shape2 = shapeFactory.getForm("CL");

		String removeLine = "1";
		String filepath = "students.csv";

		// call draw method of Rectangle
		shape2.use3(removeLine, filepath);

	}
}
