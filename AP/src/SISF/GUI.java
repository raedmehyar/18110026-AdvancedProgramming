package SISF;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class GUI implements Form {

	public void use() {
		System.out.println("GUI Example");
	}

	@Override
	public void use(String id, String name, String average, String filepath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void use2(String search, String filepath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void use3(String search, String filepath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void use4(String filepath, String editTerm, String newId, String newName, String newAverage) {
		// TODO Auto-generated method stub

	}

	@Override
	public void use5(String text, String text2, String text3, String filepath) {
		try {
			FileWriter fw = new FileWriter(filepath, true);
			// for good practice
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			// append the data to the file
			pw.println(text + "," + text2 + "," + text3);
			pw.flush();
			pw.close();

			JOptionPane.showMessageDialog(null, "ID: " + text + "\nName: " + text2 + "\nAverage: " + text3);
			System.out.println("Data has been saved to students.csv");

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error!");
		}
	}

}
//concrete  class