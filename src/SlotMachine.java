import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

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
	
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
	}
	
	public SlotMachine() {
	frame.setSize(300, 200);
	frame.add(panel);
	panel.add(slot1);
	showImage("Avocado.png");
	panel.add(slot2);
	panel.add(slot3);
	panel.add(spin);
	spin.addMouseListener(this);
	
	frame.setVisible(true);
	}

	
	 private void showImage(String fileName) {
			URL imageURL = getClass().getResource(fileName);
			Icon icon = new ImageIcon(imageURL);
			//JLabel image = new JLabel(icon);
			slot1 = new JLabel(icon);
			frame.add(slot1);
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
