package _06_duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void run() {

		frame.add(panel);// 1. Add the panel to the frame

		frame.setVisible(true);// 2. Make the frame visible

		leftButton.setText("Click Me!");// 3. Set the text of the leftButton to "Click me!"

		rightButton.setText("Click Me!");// 4. Set the text of the rightButton to "Click me!"

		leftButton.addActionListener(this);// 5. Add an action listener to the leftButton

		rightButton.addActionListener(this);// 6. Add an action listener to the rightButton

		panel.add(leftButton);// 7. Add the leftButton to the panel

		panel.add(rightButton);// 8. Add the rightButton to the panel

		frame.pack();// 9. Pack the frame

		frame.setTitle("Demanding Buttons");// 10. Set the title of the frame to "Demanding Buttons"

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if(buttonPressed==leftButton) {
			rightButton.setText("NO,Click Me!");/* If the buttonPressed was the leftButton.... */
			rightButton.setPreferredSize(BIG);
			leftButton.setText("Click Me!");
			leftButton.setPreferredSize(SMALL);
		}
		else if(buttonPressed== rightButton) {
			leftButton.setText("NO,Click Me!");/* If the buttonPressed was the leftButton.... */
			leftButton.setPreferredSize(BIG);
			rightButton.setText("Click Me!");
			rightButton.setPreferredSize(SMALL);
		}
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
}
