package com.sarthak.facedetection;

import javax.swing.UIManager;

public class App {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
		      ex.printStackTrace();
	    }
		
		MainFrame mainframe = new MainFrame();
		mainframe.displayScreen(); 
		
			
	};
	
	

	}


