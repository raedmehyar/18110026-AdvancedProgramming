package SISF;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class CreateFile {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("students.csv", true);
		PrintWriter pw = new PrintWriter(fos);

		pw.println("ID, Name, Average");
		pw.close();

		JOptionPane.showMessageDialog(null, "File has been created with these columns:\nID" + "\nName" + "\nAverage");
		System.out.println("File students.csv has been created");

	}

};