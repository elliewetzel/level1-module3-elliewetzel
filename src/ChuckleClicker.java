import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton joke = new JButton();
	static JButton punchline = new JButton();
public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
}

private void makeButtons() {
	frame.setVisible(true);
	frame.add(panel);
	joke.setText("joke");
	panel.add(joke);
	joke.addActionListener(this);
	punchline.setText("punchline");
	panel.add(punchline);
	punchline.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "What do you call an alligator in a vest?");
	}
	else if(e.getSource() == punchline) {
		JOptionPane.showMessageDialog(null, "An Investigator");
	}
	
}
}
