import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements MouseListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField text = new JTextField(15);
	static JButton button = new JButton("Search Tweets");
	public static void main(String[] args) {
		GetLatestTweet tweet = new GetLatestTweet();
	}
	
	public GetLatestTweet() {
	frame.setVisible(true);
	frame.setSize(500, 500);
	frame.add(panel);
	panel.add(text);
	panel.add(button);
	button.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("tweet,  tweet");
		String x = getLatestTweet(text.getText().toString());
		JOptionPane.showMessageDialog(null, x);
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
	private String getLatestTweet(String searchingFor) {

	      Twitter twitter = new TwitterFactory().getInstance();

	      AccessToken accessToken = new AccessToken(
	            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

	      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

	      twitter.setOAuthAccessToken(accessToken);

	      Query query = new Query(searchingFor);
	      try {
	            QueryResult result = twitter.search(query);
	            return result.getTweets().get(0).getText();
	      } catch (Exception e) {
	            System.err.print(e.getMessage());
	            return "What the heck is that?";
	      }
	}
}
