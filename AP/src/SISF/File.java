package SISF;

public class File {

	// use getShape method to get object of type shape
	public Form getForm(String formType) {
		if (formType == null) {
			return null;
		}
		if (formType.equalsIgnoreCase("GUI")) {
			return new GUI();

		} else if (formType.equalsIgnoreCase("CL")) {
			return new CL();

		}

		return null;
	}
}
//factory