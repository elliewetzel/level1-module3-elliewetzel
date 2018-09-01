import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {
	public static void main(String[] args) {
		NastySurprise nasty = new NastySurprise();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();	
		frame.add(panel);
		JButton trickbutton = new JButton();
		panel.add(trickbutton);
		JButton treatbuttons = new JButton();
		panel.add(treatbuttons);
		JLabel label = new JLabel();
		label.setText("Trick");
		trickbutton.add(label);
		JLabel labels = new JLabel();
		labels.setText("Treat");
		treatbuttons.add(labels);
		
		//have to add an action listener
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	}
