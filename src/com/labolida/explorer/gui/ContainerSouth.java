package com.labolida.explorer.gui;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JLabel;

import com.labolida.explorer.events.EVENT_MENU;

public class ContainerSouth extends Container {
	
	public Button button1 = new Button("Rename");
	public Button button2 = new Button("Delete");
	public Button button3 = new Button("Clone");
	public Button button4 = new Button("CopyTo");
	public Button button5 = new Button("MoveTo");
	
	public ContainerSouth(){
		
		GridLayout layout = new GridLayout(1,1);
		layout.setHgap(20);
		layout.setVgap(20);
		this.setLayout( layout );
		
		this.add( new JLabel("Explorer 1.0") );
		this.add( button1 );
		this.add( button2 );
		this.add( button3 );
		this.add( button4 );
		this.add( button5 );
		
		EVENT_MENU event = new EVENT_MENU();
		button1.addActionListener(event);
		
	}
}
