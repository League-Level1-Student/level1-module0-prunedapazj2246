package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();

	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	
	public void showButton() {
		// TODO Auto-generated method stub
		l1.setText("ducks");
		l2.setText("frog");
		l3.setText("unicorn");
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

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(b1)) {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");// TODO Auto-generated method stub
	}else if(e.getSource().equals(b2)) {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	else if(e.getSource().equals(b3)) {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
