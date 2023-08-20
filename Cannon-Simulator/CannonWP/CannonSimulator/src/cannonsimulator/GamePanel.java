package cannonsimulator;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	public static int WIDTH = 800;
	public static int HEIGHT = 600;
	
	private Thread thread;
	private boolean running;
	private BufferedImage image;
	private Graphics2D g;
	private int fps = 60;
	
	public GamePanel() {
		super();
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setFocusable(true);
		requestFocus();
		
		System.out.println("GamePanel() called");
	}
	
	@Override
	public void addNotify() { //swing calls once by default
		super.addNotify(); //call the default behavior. At last, to be commented and checked
		if(thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		System.out.println("addNotify() called");
	}
	
	@Override
	public void run() {
		System.out.println("run() called");
	}
}
