package SISF;

public class CodeCU {
	public static void main(String[] args) {
		File shapeFactory = new File();

		// get an object of Rectangle and call its draw method.
		Form shape2 = shapeFactory.getForm("CL");

		String editTerm = "1";
		String filepath = "students.csv";
		String newId = "1";
		String newName = "Joseph";
		String newAverage = "88";

		// call draw method of Rectangle
		shape2.use4(filepath, editTerm, newId, newName, newAverage);

	}
}
