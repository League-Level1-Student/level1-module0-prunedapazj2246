package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public void run() {

		JFrame frame = new JFrame();// 1. Create and initialize an object of the JFrame class

		frame.setVisible(true);// 2. Set your JFrame object to be visible

		// 3. Run your program. Do you see your window? It's probably very
		// small.
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 4. Set the default close operation to JFrame.EXIT_ON_CLOSE

	JPanel panel = new JPanel();	// 5. Create and initialize an object of the JPanel class

		JLabel label = new JLabel();// 6. Create and initialize an object of the JLabel class

		label.setText("Hello. How are you today?");// 7. Set the text of the JLabel to a lovely greeting.

	frame.add(panel);// 8. Add the JPanel object to the JFrame

		panel.add(label);// 9. Add the JLabel object to the JPanel

	//frame.pack();	// 10. Pack your JFrame.

		// 11. Run your program again. Do you see your message.

		label.setIcon(loadImage());// 12. Use the loadImage method to set the icon of the JLabel object.

		frame.pack();// 13. Re-pack the JFrame object.

		// 14. Run the program one more time. Do you see the image?

	}

	public ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {

			return null;
		}
	}
}
