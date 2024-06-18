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
			
			ComponentTableViewFiles beanTable = new ComponentTableViewFiles();
			ApplicationContext.map.put("beanTable", beanTable);
			
			this.add( beanTable.scrollPane );
		} 
		catch (Exception e) {
			System.out.println("error at PaneListView.(): "+ e.getMessage());
		}
	}
}