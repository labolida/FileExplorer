package com.labolida.explorer.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import com.labolida.explorer.events.EVENT_MENU;

public class ComponentMenu {
	
	public static JMenuBar getMenuBar(){
		
		JMenuBar  menuBar =  new JMenuBar();
		
		JMenu menu_file  = new JMenu("File");
		
		menuBar.add(menu_file);
		
		JMenuItem item_rename  =  new JMenuItem("Rename");
		JMenuItem item_delete  =  new JMenuItem("Delete");
		JMenuItem item_clone  =  new JMenuItem("Clone");
		JMenuItem item_copy_to  =  new JMenuItem("CopyTo");
		JMenuItem item_move_to  =  new JMenuItem("MoveTo");
		
		menu_file.add( item_rename);
		menu_file.add( item_delete);
		menu_file.add( item_clone);
		menu_file.add( item_copy_to);
		menu_file.add( item_move_to);
		
		
		EVENT_MENU event = new EVENT_MENU();
		item_rename.addActionListener(event);
		item_delete.addActionListener(event);
		item_clone.addActionListener(event);
		item_copy_to.addActionListener(event);
		item_move_to.addActionListener(event);
		
		return menuBar;
	}
}