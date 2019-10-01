package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	String liverpool = "https://i.pinimg.com/originals/70/25/e2/7025e2de5fe90d540bdaa6b964b88fed.jpg";	// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

	Component lLogo;  	// 2. create a variable of type "Component" that will hold your image
lLogo=createImage(liverpool);	// 3. use the "createImage()" method below to initialize your Component

	quizWindow.add(lLogo)	;// 4. add the image to the quiz window

	quizWindow.pack();	// 5. call the pack() method on the quiz window

		String answer1 = JOptionPane.showInputDialog("Which soccer team corresponds to this logo?");// 6. ask a question that relates to the image

		if(answer1.equals("liverpool")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");// 7. print "CORRECT" if the user gave the right answer
		}

		else{
			JOptionPane.showMessageDialog(null, "INCORRECT!");	// 8. print "INCORRECT" if the answer is wrong
		}

	quizWindow.remove(lLogo);	// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		String argentina = "https://www.pinclipart.com/picdir/middle/217-2173330_football-team-logos-argentine-argentina-futbol-logo-png.png";
				Component aLogo;// 10. find another image and create it (might take more than one line
		// of code)
aLogo=createImage(argentina);
		quizWindow.add(aLogo);// 11. add the second image to the quiz window

		quizWindow.pack();// 12. pack the quiz window

		String answer2 = JOptionPane.showInputDialog("Which soccer team corresponds to this logo?");// 13. ask another question

		if(answer2.equals("argentina")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			// 14+ check answer, say if correct or incorrect, etc.
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
