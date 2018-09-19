import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

	public class TypingTutor implements KeyListener{
		static JFrame frame = new JFrame();
		static JLabel label = new JLabel();
		char currentLetter;
		public static void main(String[] args) {
			TypingTutor tt = new TypingTutor();
			
		}
		public void initializeGUI() {
			frame.setVisible(true);
			frame.setTitle("Type or Die");
			frame.addKeyListener(this);
			currentLetter = generateRandomLetter();
			label.setFont(label.getFont().deriveFont(28.0f));
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setText(String.valueOf(currentLetter));
			frame.add(label);
			frame.pack();
		}
		
		
		public TypingTutor() {
		initializeGUI();	
		}
		
		char generateRandomLetter() {
		      Random r = new Random();
		      return (char) (r.nextInt(26) + 'a');
		}
		@Override
		public void keyTyped(KeyEvent e) {
			
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			
			System.out.println("Yout typed: " + e.getKeyChar());
			if(e.getKeyChar() == currentLetter) {
				System.out.println("correct");
				frame.getContentPane().setBackground(Color.green);
			}
			else {
				frame.getContentPane().setBackground(Color.red);
			}
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			currentLetter = generateRandomLetter();
			label.setText(String.valueOf(currentLetter));
		}
		
}