package com.labolida.explorer.gui;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JSplitPane;

public class SplitPanel {
	
	public static JSplitPane generate( Component comp1 , Component comp2, int initialSize , boolean horizontal ) {
		JSplitPane splitPane;
		if (horizontal) { 
			splitPane = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT , comp1 , comp2 );
		}
		else{
			splitPane = new JSplitPane( JSplitPane.VERTICAL_SPLIT , comp1 , comp2 );
		}
		
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(initialSize);    //initial size!
		Dimension minimumSize = new Dimension(1, 1);
		comp1.setMinimumSize(minimumSize);
		comp2.setMinimumSize(minimumSize);
		return splitPane;
	}
}