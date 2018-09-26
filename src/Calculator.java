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
	public static int multiply(int c, int d) {
		return c*d;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
	public static int divide(int c, int d) {
		return c/d;
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
	panel.add(subtract);
	panel.add(multiply);
	panel.add(divide);
	panel.add(answer);
	frame.setVisible(true);
}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Integer ans = null;
		entry1.toString();
		int x = Integer.parseInt(entry1.toString());
		entry2.toString();
		int y = Integer.parseInt(entry2.toString());
		if(e.getSource().equals(add)) {
			ans = add(x,y);
		}
		else if(e.getSource().equals(subtract)) {
			ans = subtract(x,y);
		}
		else if(e.getSource().equals(multiply)) {
			ans = multiply(x,y);
		}
		else if(e.getSource().equals(divide)) {
			ans = divide(x, y);
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
