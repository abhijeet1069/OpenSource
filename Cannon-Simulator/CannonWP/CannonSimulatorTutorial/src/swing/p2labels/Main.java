package swing.p2labels;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
	
		// JLabel = a GUI display area for a string of text, an image or both
		ImageIcon image = new ImageIcon("/Users/satyam/Personal/OpenSource/Cannon-Simulator/CannonWP/CannonSimulatorTutorial/res/among_us.png");
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code?");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.setSize(800,600);
		frame.setVisible(true);
		
	}

}
