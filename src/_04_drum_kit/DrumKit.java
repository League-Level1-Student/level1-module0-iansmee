package _04_drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel label;

	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame frame = new JFrame();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Set the size of the frame
frame.setSize(400, 400);
		// 4. Set the title of the frame
frame.setTitle("DrumKit");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
JPanel panel = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
frame.add(panel);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "recipe package(drum_kit)".
 
		// 8. Put the name of your image file in a String variable.
String drum = "drum.jpg";
		// 9. Edit the next line to use your String variable
		// drumLabelWithImage = createLabelImage(drumImageString);
label = createLabelImage(drum);
		// 10. Add the image to the panel
panel.add(label);
		// 11. Set the layout of the panel to "new GridLayout()"
new GridLayout();
		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
frame.pack();
		// 13. add this mouse listener to drumLabelWithImage
label.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.

	}

	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.

		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
					System.out.println("mouse clicked");
					
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "recipe package(drum_kit)".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works
if (drumClicked == label) {
	JOptionPane.showMessageDialog(null, "bong");
} 

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	
		//AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		//sound.play();
		void playSound(String soundFile) {
		   
		    try { File f = new File("./" + soundFile);
		    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
		    Clip clip = AudioSystem.getClip();
				clip.open(audioIn);  clip.start();
			} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		}

	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
