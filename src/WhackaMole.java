import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements MouseListener {
	static JFrame frame = new JFrame();
	static JPanel panel;
	static int w = 0;
	static int click;
	static int whacked;
	static Date timeAtStart;
	public static void main(String[] args) {
		new WhackaMole().drawButtons(new Random().nextInt(24));
		timeAtStart = new Date();
	}

	public void drawButtons(int r) {
		System.out.println(r);
		frame = new JFrame();
		frame.setSize(390, 300);
		panel = new JPanel();
		frame.add(panel);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			if (i == r) {
				button.setText("mole!");
			}
			button.addMouseListener(this);
		}
		frame.setVisible(true);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource("https://freesound.org/people/David%20Bowman/sounds/108945/"));
	     sound.play();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton k = (JButton) e.getSource();
		playSound("https://freesound.org/people/David%20Bowman/sounds/108945/");
		System.out.println(click);
		if (k.getText().equals("mole!")) {
			whacked++;
			frame.dispose();
			drawButtons(new Random().nextInt(24));
			if(whacked == 10) {
				endGame(timeAtStart, whacked);
			}
		} 
		else {
			click++;
			speak("incorrect");
			if(click > 5) {
				JOptionPane.showMessageDialog(null, "You lost");
				endGame(timeAtStart, click);
			}
		}
		
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
