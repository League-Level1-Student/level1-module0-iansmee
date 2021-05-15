package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class SoundEffectsMachine implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton();
	JButton button2 = new JButton();
	JPanel panel = new JPanel();
public void showButton() {

	
	frame.setVisible(true); 
		
	
	
	panel.add(button);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
	button2.setText("boop");
	button.setText("beep");
	button2.addActionListener(this);
	button.addActionListener(this);
} 

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button) {
		playSound("beep.wav.wav");
	}
	if(e.getSource()==button2) {
		playSound("boop.wav.wav");
	}
}
private void playSound(String soundFile) {
	String path = "src/_09_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}

	
	
}
