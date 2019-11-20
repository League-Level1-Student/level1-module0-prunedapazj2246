package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class jackInTheBox implements ActionListener {
	int counter =0;
	 JFrame frame =new JFrame();
public void showButton() {
	  
       JButton bu = new JButton();
       JLabel la = new JLabel();
       frame.add(bu);
       frame.setVisible(true);
       frame.pack();
       bu.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		counter+=1;
		if(counter==5) {
		frame.add(jackInTheBox.png)	;
		}
	}
	 
}
