package _04_drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel cymbalLabelWithImage;
JLabel druLabelWithImage; 
	public void run() throws MalformedURLException {

		JFrame frame = new JFrame();// 1. Make a JFrame variable and initialize it using "new JFrame()"

	frame.setVisible(true);	// 2. Make the frame visible and
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// set its default close operation to JFrame.EXIT_ON_CLOSE

		frame.setSize(500, 500);// 3. Set the size of the frame

		frame.setTitle("BPPPM");// 4. Set the title of the frame

		JPanel panel = new JPanel();// 5. Make a JPanel variable and initialize it using "new JPanel().

		frame.add(panel);// 6. Add the panel to the frame. (The panel is invisible.)

		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".

		String cymbal = "cymbal.jpg";// 8. Put the name of your image file in a String variable.

		// 9. Edit the next line to use your String variable
		cymbalLabelWithImage=createLabelImage(cymbal);// drumLabelWithImage = createLabelImage(drumImageString);

		panel.add(cymbalLabelWithImage);// 10. Add the image to the panel

		panel.setLayout(new GridLayout());// 11. Set the layout of the panel to "new GridLayout()"

		frame.pack();// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?

		cymbalLabelWithImage.addMouseListener(this);// 13. add this mouse listener to drumLabelWithImage

		String drum = "snare.jpg";// 18. Add more images to make a drumkit. Remember to add this mouse
		druLabelWithImage=createLabelImage(drum);// listener to each one.
		panel.add(druLabelWithImage);
		panel.setLayout(new GridLayout());
		frame.pack();
		druLabelWithImage.addMouseListener(this);
		
	}

	public void mouseClicked(MouseEvent e,MouseEvent c) {
		System.out.println("mouse clicked");// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.

		JLabel cymbalClicked = (JLabel) e.getSource(); // This line gets the label
			JLabel drumClicked = (JLabel) c.getSource();							// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		if(cymbalClicked != null ) {
			playSound("cymbal.wav");// 16. If they clicked on the drumImage...

		}
		else if(drumClicked!= null) {
			playSound("drum.wav");
		}
		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works

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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
