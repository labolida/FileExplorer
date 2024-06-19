package com.labolida.explorer.gui;

import java.awt.GridLayout;
import javax.swing.JPanel;

import com.labolida.explorer.ApplicationContext;
import com.labolida.explorer.LOG;


public class PaneRight extends JPanel {
	
	private LOG log = new LOG(this.getClass());
	
	public PaneRight(){
		try {
			GridLayout layout = new GridLayout();
			layout.setHgap(10);
			layout.setVgap(10);
			this.setLayout( layout  );
			
			this.add( ApplicationContext.componentTableViewFiles.getInstanceMainComponent() );
		} 
		catch (Exception e) {
			System.out.println("error at PaneListView.(): "+ e.getMessage());
			log.write(e, "PaneRight Constructor error");
		}
	}
}