package SISF;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setTitle("SIS | Student Information System");
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JLabel lblName = new JLabel("Enter your number:");
		JTextField txtName =  new JTextField(10);
		JButton btnName = new JButton("Say Hi");
		
		frame.add(lblName);
		frame.add(txtName);
		frame.add(btnName);
		
		btnName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hello: "+txtName.getText());
				JOptionPane.showMessageDialog(null,"Hello: "+txtName.getText());
			}
		});
		
		frame.setVisible(true);
	}
}
