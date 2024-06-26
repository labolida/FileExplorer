package com.labolida.explorer.gui;

import java.awt.GridLayout;
import javax.swing.JPanel;
import com.labolida.explorer.ApplicationContext;
import com.labolida.explorer.LOG;


public class PaneLeft extends JPanel {
	
	private LOG log = new LOG(this.getClass());
	
	public PaneLeft(){
		try {
			GridLayout layout = new GridLayout();
			layout.setHgap(10);
			layout.setVgap(10);
			this.setLayout( layout );
			
			this.add( ApplicationContext.componentTreeView.getInstanceMainComponent() );
		} 
		catch (Exception e) {
			log.write(e, "PaneLeft Constructor error");
		}
	}
}