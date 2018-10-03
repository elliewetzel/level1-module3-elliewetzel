import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackaMole {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();
	static JButton button4 = new JButton();
	static JButton button5 = new JButton();
	static JButton button6 = new JButton();
	static JButton button7 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	static JButton button1 = new JButton();
	public static void main(String[] args) {
		new WhackaMole().drawButtons(new Random());
	}

	
	public void drawButtons(Random r) {
		frame.setSize(500, 500);
		frame.add(panel);
		panel.add(button1);
		frame.setVisible(true);
	}
}
