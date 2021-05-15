package _10_cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JFrame frame = new JFrame();
		JButton button = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JPanel panel = new JPanel();
	public void showButton() {
		
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
		
		frame.setVisible(true);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	button.setText("Ducks");
	button2.setText("Frogs");
	button3.setText("Unicorns");
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
			showDucks();
		}
		if(e.getSource()==button2) {
			showFrog();
		}
		if(e.getSource()==button3) {
		showFluffyUnicorns();
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
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	      try {
	      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	      if (Runtime.getRuntime().exec(new String[] { 
	       "which", "xdg- open" }).getInputStream().read() != -1) {
	      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	      }
	      } else {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      }      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}
	
	
	
	
}