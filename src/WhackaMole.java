import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements MouseListener {
	static JFrame frame = new JFrame();
	static JPanel panel;
	static int w = 0;

	public static void main(String[] args) {
		new WhackaMole().drawButtons(new Random().nextInt(24));
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton k = (JButton) e.getSource();

		if (k.getText().equals("mole!")) {
			frame.dispose();
			drawButtons(new Random().nextInt(24));
		} else {
			speak("incorrect");
		}
		if (w == 10) {
			endGame(null, 0);
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
