package com.labolida.explorer.gui;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JSplitPane;

public class ContainerCenter extends Container {

	public ContainerCenter() {
		
		GridLayout layout = new GridLayout(1,1) ;
		layout.setVgap(10);
		layout.setHgap(10);
		this.setLayout(layout);
		
		PaneLeft paneLeft = new PaneLeft();
		PaneRight paneRight = new PaneRight();
		
		JSplitPane splitPane1 = SplitPanel.generate( paneLeft , paneRight , 300 , true );            // Split horizontal {left.with=300px;}
		this.add( splitPane1 );
	}
}