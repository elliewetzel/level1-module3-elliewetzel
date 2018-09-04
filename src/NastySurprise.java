import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class NastySurprise implements  MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trickbutton = new JButton();
	JButton treatbuttons = new JButton();
	public static void main(String[] args) {
		NastySurprise nasty = new NastySurprise();
	}	
	public NastySurprise() {
		frame.setVisible(true);
		frame.add(panel);		
		trickbutton.addMouseListener(this);
		panel.add(trickbutton);
		panel.add(treatbuttons);
		treatbuttons.addMouseListener(this);
		JLabel label = new JLabel();
		label.setText("Trick");
		trickbutton.add(label);
		JLabel labels = new JLabel();
		labels.setText("Treat");
		treatbuttons.add(labels);
		frame.pack();
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
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("clicked");
		
		if(e.getSource() == trickbutton) {
			showPictureFromTheInternet("https://cdn.shopify.com/s/files/1/1368/5523/products/wink_poodle_F4_1024x1024.jpg?v=1527264086");
		}
		else if(e.getSource() == treatbuttons) {
			showPictureFromTheInternet("https://i.pinimg.com/236x/18/77/97/1877975c291e712e9567692d80f664c3--creepy-dolls-creepy-art.jpg");
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
