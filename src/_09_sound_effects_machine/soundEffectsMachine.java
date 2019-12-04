package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
public void showButton() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	l1.setText("violin");
	l2.setText("villager");
	l3.setText("fire");
	b1.add(l1);
	b2.add(l2);
	b3.add(l3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}
private void playSound(String fileName) {

    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

    sound.play();

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
