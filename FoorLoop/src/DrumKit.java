
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		JFrame test = new JFrame();
		test.setVisible(true);
		test.setSize(100, 100);
		test.setTitle("lol");
		JPanel more = new JPanel();
		test.add(more);
		String anything = "z.jpg";
		drumLabelWithImage = createLabelImage(anything);
		more.add(drumLabelWithImage);
		more.setLayout(new GridLayout());
		test.pack();

		drumLabelWithImage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {

		
		JLabel drumClicked = (JLabel) e.getSource();		
		
		if(drumLabelWithImage.equals(drumClicked)){
			playSound("1234567890.wav");
		}
	
		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound.

		// 18. Add more images to make a drumkit. Remember to add a mouse
		// listener to each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
