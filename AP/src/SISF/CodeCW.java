package SISF;

public class CodeCW {

	public static void main(String[] args) {
		File shapeFactory = new File();

		// get an object of Rectangle and call its draw method.
		Form shape2 = shapeFactory.getForm("CL");

		String id = "1";
		String name = "Matthew";
		String average = "75";
		String filepath = "students.csv";

		// call draw method of Rectangle
		shape2.use(id, name, average, filepath);

	}
}
