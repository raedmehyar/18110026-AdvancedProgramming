package SISF;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CodeGW {

	public static void main(String[] args) {
		File shapeFactory = new File();

		// get an object of Rectangle and call its draw method.
		Form shape2 = shapeFactory.getForm("GUI");

		JFrame frame = new JFrame();

		frame.setTitle("SIS");
		frame.setSize(200, 400);
		frame.setLocationRelativeTo(null);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		JLabel lblName1 = new JLabel("Enter number:");
		JLabel lblName2 = new JLabel("Enter name:");
		JLabel lblName3 = new JLabel("Enter average:");
		JTextField id = new JTextField(10);
		JTextField name = new JTextField(10);
		JTextField average = new JTextField(10);
		JButton btnName = new JButton("Enter");

		frame.add(lblName1);
		frame.add(id);
		frame.add(btnName);

		frame.add(lblName2);
		frame.add(name);
		frame.add(btnName);

		frame.add(lblName3);
		frame.add(average);
		frame.add(btnName);

		btnName.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// call draw method of Rectangle
				String filepath = "students.csv";
				shape2.use5(id.getText(), name.getText(), average.getText(), filepath);
			}
		});

		frame.setVisible(true);

	}
}