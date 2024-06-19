package com.labolida.explorer.gui;

import java.awt.Container;
import java.awt.GridLayout;
import com.labolida.explorer.ApplicationContext;

public class ContainerNorth extends Container{
	
	public ContainerNorth ( ) {

		GridLayout layout = new GridLayout(1,2);
		this.setLayout( layout );
		layout.setHgap(100);
		layout.setVgap(100);
		
		this.add( ApplicationContext.componentPathUrlText );
	}
}