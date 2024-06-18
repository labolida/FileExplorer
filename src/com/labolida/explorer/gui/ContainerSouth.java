package com.labolida.explorer.gui;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class ContainerSouth extends Container {
	
	public Button button1 = new Button("Open");
	public Button button2 = new Button("Open");
	public Button button3 = new Button("Open");
	public Button button4 = new Button("Open");
	public Button button5 = new Button("Open");
	
	public ContainerSouth(){
		GridLayout layout = new GridLayout(1,1);
		this.setLayout( layout );
		layout.setHgap(2);
		layout.setVgap(2);
		this.add( new JLabel("Explorer 1.0") );
		this.add( button1 );
		this.add( button2 );
		this.add( button3 );
		this.add( button4 );
		this.add( button5 );
	}
}
