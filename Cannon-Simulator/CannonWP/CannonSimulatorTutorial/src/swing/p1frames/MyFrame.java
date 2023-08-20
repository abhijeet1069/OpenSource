package swing.p1frames;

import java.awt.Color;
import java.awt.Taskbar;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
		// JFrame = a GUI window to add components to
		setTitle("Hello World");
		setSize(500,500);
		setLocationRelativeTo(null);//place JFrame in middle of screen
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		getContentPane().setBackground(new Color(123,50,250));
		
		// Set the dock icon for macOS
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            try {
            	File imageFile = new File("/Users/satyam/Personal/OpenSource/Cannon-Simulator/CannonWP/CannonSimulatorTutorial/res/logo.png");
                BufferedImage image = ImageIO.read(imageFile);
                Taskbar.getTaskbar().setIconImage(image);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}
}
