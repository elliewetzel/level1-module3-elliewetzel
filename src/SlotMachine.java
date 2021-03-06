import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();  
	JLabel slot1 = new JLabel();
	JLabel slot2 = new JLabel();
	JLabel slot3 = new JLabel();
	int s = 0;
	JLabel score = new JLabel("Score");
	Icon avocado;
	Icon orange;
	Icon lemon;
	
	
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
	}
	
	public SlotMachine() {
		URL imageURL = getClass().getResource("Avocado.png");
		avocado = new ImageIcon(imageURL);
		
		imageURL = getClass().getResource("Orange.png");
		orange = new ImageIcon(imageURL);
		
		imageURL = getClass().getResource("Lemon.png");
		lemon = new ImageIcon(imageURL);
	frame.setSize(600, 300);
	frame.add(panel);
	showImage(slot1);
	panel.add(slot1);
	showImage(slot2);
	panel.add(slot2);
	showImage(slot3);
	panel.add(slot3);
	panel.add(score);
	panel.add(spin);
	spin.setText("SPIN");
	spin.addMouseListener(this);
	frame.pack();
	frame.setVisible(true);
	}

	
	 private void showImage(JLabel label) {
		 int r = new Random().nextInt(3);
		 System.out.println(r);
		 if(r == 0) {
		label.setIcon(avocado);
		}
		 else if(r == 1) {
		label.setIcon(orange);
		 }
		 else if(r ==  2) {
		 label.setIcon(lemon);
		 }
	
	 }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton k = (JButton) e.getSource();
		
		if((k.getText().equals("SPIN"))) {
			System.out.println("spin");
			showImage(slot1);
			showImage(slot2);
			showImage(slot3);
			frame.repaint();
		}
		if(slot1.getIcon().equals(avocado) && slot2.getIcon().equals(avocado) && slot3.getIcon().equals(avocado)) {
			s++;
			score.setText("You win!  Your score is " + s + ".");
		}
		else if(slot1.getIcon().equals(orange) && slot2.getIcon().equals(orange) && slot3.getIcon().equals(orange)) {
			s++;
			score.setText("You win!  Your score is " + s + ".");
		}
		else if(slot1.getIcon().equals(lemon) && slot2.getIcon().equals(lemon) && slot3.getIcon().equals(lemon)) {
			s++;
			score.setText("You win!  Your score is " + s + ".");
		}
		else {
			score.setText("Try to spin again");
		}

	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
