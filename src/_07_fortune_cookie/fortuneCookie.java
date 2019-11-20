package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
    public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
       button.addActionListener(this); 
       
      
      
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		 System.out.println(rand);
		JOptionPane.showMessageDialog(null, "Woohoo!!");
		 if(rand == 0) {
	    	   JOptionPane.showMessageDialog(null, "YOur a mom!!!!");	   
	       }else if(rand==1) {
	    	   JOptionPane.showMessageDialog(null, "You will have a great day.");  
	       }else if (rand==2) {
	    	   JOptionPane.showMessageDialog(null, "YOU will find true love today(not!!)!");
	       }else if(rand == 3) {
	    	   JOptionPane.showMessageDialog(null, "You will get scratched by a cat");
	    	   
	       }else if(rand == 4 ){
	    	   JOptionPane.showMessageDialog(null, "YOU ARE A suitcase!!");
	       }
	}
}