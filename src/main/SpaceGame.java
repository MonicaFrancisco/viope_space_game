package main;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;

import model.Body;
import model.Universe;
import utils.Vector;
import utils.ConstantsUniverse;
import utils.ConstantsSpaceGame;

public class SpaceGame {
	private static SpaceGUI spaceGUI;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		spaceGUI = new SpaceGUI();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame spaceFrame = new JFrame();
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Dimension screenSize = toolkit.getScreenSize();
				Container cp = spaceFrame.getContentPane();
				cp.setBackground(Color.black);
				spaceFrame.setSize(screenSize.width*10/7,screenSize.height*10/7);
				spaceFrame.setLocationByPlatform(true);
				spaceFrame.add(spaceGUI);
				spaceFrame.setTitle("Space Game");
				spaceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				spaceFrame.setVisible(true);
			}
		});
		
		Game game = new Game();
		spaceGUI.setGame(game);
		game.setSpaceGUI(spaceGUI);
		game.runGame();
	}
	
}