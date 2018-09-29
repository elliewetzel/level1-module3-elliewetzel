import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
	public static int divide(int a, int b) {
		return a/b;
	}
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton add = new JButton("add");
	static JButton subtract = new JButton("sub");
	static JButton multiply = new JButton("mul");
	static JButton divide = new JButton("div");
	static JTextField entry1 = new JTextField(15);
	static JTextField entry2 = new JTextField(15);
	static JLabel answer = new JLabel();
	
	Calculator() {
	frame.setSize(450, 150);
	frame.add(panel);
	panel.add(entry1);
	panel.add(entry2);
	panel.add(add);
	add.addMouseListener(this);
	subtract.addMouseListener(this);
	multiply.addMouseListener(this);
	divide.addMouseListener(this);
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	panel.add(answer);
	answer.setVisible(true);
	frame.setVisible(true);
}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Integer ans = null;
		entry1.getText();
		int a = Integer.parseInt(entry1.getText());
		entry2.getText();
		int b = Integer.parseInt(entry2.getText());
		if(e.getSource().equals(add)) {
			ans = add(a,b);
			answer.setText(ans + "");
		}
		else if(e.getSource().equals(subtract)) {
			ans = subtract(a,b);
			answer.setText(ans + "");
		}
		else if(e.getSource().equals(multiply)) {
			ans = multiply(a,b);
			answer.setText(ans + "");
		}
		else if(e.getSource().equals(divide)) {
			ans = divide(a,b);
			answer.setText(ans + "");
		}
		System.out.println(ans.toString());
				//answer.setText(ans.toString());
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
