package SISF;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CL implements Form {

	public void use(String id, String name, String average, String filepath) {
		try {
			FileWriter fw = new FileWriter(filepath, true);
			// for good practice
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			// append the data to the file
			pw.println(id + "," + name + "," + average);
			pw.flush();
			pw.close();

			JOptionPane.showMessageDialog(null, "ID: " + id + "\nName: " + name + "\nAverage: " + average);
			System.out.println("Data has been saved to students.csv");

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error!");
		}
	}

	private static Scanner x;

	public void use2(String search, String filepath) {

		boolean found = false;
		String id = "";
		String name = "";
		String average = "";

		try {
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");

			while (x.hasNext() && !found) {
				// x.hasNext to check other lines
				// !found to check the id
				id = x.next();
				name = x.next();
				average = x.next();

				if (id.equals(search)) {
					found = true;
				}

			}
			if (found) {
				JOptionPane.showMessageDialog(null, "ID: " + id + "\nName: " + name + "\nAverage: " + average);
				System.out.println("Data has been extracted from students.csv");
			} else {
				JOptionPane.showMessageDialog(null, "Record Not Found!");
			}
			// sequence of one or more characters used to specify boundaries instead of
			// reading strings and splitting values
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error!");
		}

	}

	public void use3(String filepath, String removeLine) {
		String tempfile = "temp1.csv";
		File OldFile = new File(filepath);
		File NewFile = new File(tempfile);
		String id = "";
		String name = "";
		String average = "";
		try {
			FileWriter fw = new FileWriter(tempfile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");

			while (x.hasNext()) {
				id = x.next();
				name = x.next();
				average = x.next();
				if (!id.equals(removeLine)) {

					pw.print(id + "," + name + "," + average);
				}
			}
			x.close();
			pw.flush();
			pw.close();
			OldFile.delete();
			File dump = new File(filepath);
			NewFile.renameTo(dump);
			JOptionPane.showMessageDialog(null, "Deleted");
			System.out.println("Data has been deleted from students.csv");

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error!");
		}
	}

	public void use4(String filepath, String editTerm, String newId, String newName, String newAverage) {

		String tempFile = "temp2.csv";
		File OldFile = new File(filepath);
		File NewFile = new File(tempFile);
		String id = "";
		String name = "";
		String average = "";
		try {
			FileWriter fw = new FileWriter(tempFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			x = new Scanner(new File(filepath));
			x.useDelimiter("[,\n]");

			while (x.hasNext()) {
				id = x.next();
				name = x.next();
				average = x.next();
				if (id.equals(editTerm)) {
					pw.print(id + "," + newName + "," + newAverage);
				} else {
					pw.print(id + "," + name + "," + average);
				}
			}
			x.close();
			pw.flush();
			pw.close();
			OldFile.delete();
			File dump = new File(filepath);
			NewFile.renameTo(dump);
			JOptionPane.showMessageDialog(null, "Updated");
			System.out.println("Data has been updated in students.csv");

		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error!");
			// appears when you update 2 or more rows
		}
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