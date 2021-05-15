package _08_jack_in_the_box;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener {
JFrame frame = new JFrame();
        JButton button = new JButton();
        int amountPressed = 0;
    public void showButton() {
        System.out.println("Button clicked");
        
        
        
        frame.setVisible(true);
        frame.add(button);
       button.setText("Surprise");
        frame.pack();
        button.addActionListener(this);

   } 


private void showPicture(String fileName) { 
    try {
         JLabel imageLabel = createLabelImage(fileName);
         JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (Exception e) {
         e.printStackTrace();
    }
}



private JLabel createLabelImage(String fileName) {
   try {
	          URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
             System.err.println("Could not find image " + fileName);
             return new JLabel();
         } else {
              Icon icon = new ImageIcon(imageURL);
              JLabel imageLabel = new JLabel(icon);
              return imageLabel;
        }
    } catch (Exception e) {
         System.err.println("Could not find image " + fileName);
         return new JLabel();
   }
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		amountPressed ++;
		if(amountPressed==5) {
			showPicture("jackInTheBox.png");
		}
	}
}

}
