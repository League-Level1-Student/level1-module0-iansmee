package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
    public void showButton() {
        System.out.println("Button clicked");
     
        JFrame frame = new JFrame();
        JButton button = new JButton();
        
        frame.setVisible(true);
        frame.add(button);
        frame.pack();
        
        button.addActionListener(this);


        
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Woohoo");
		
		Random rand = new Random();
int num = rand.nextInt(5);
if(num == 1) {
	JOptionPane.showMessageDialog(null,"Kanye");
}
else if(num == 2) {
	JOptionPane.showMessageDialog(null,"West");
}
else if(num == 3) {
	JOptionPane.showMessageDialog(null,"Kanye West");
}
else if(num == 4) {
	JOptionPane.showMessageDialog(null,"yes");
}
else if(num == 5) {
	JOptionPane.showMessageDialog(null,"no");
}





	}
	
	
}