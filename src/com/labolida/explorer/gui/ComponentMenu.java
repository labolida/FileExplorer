package com.labolida.explorer.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ComponentMenu {
	
	public static JMenuBar getMenuBar(){
		
		JMenuBar  menuBar =  new JMenuBar();
		
		JMenu menu_file  = new JMenu("File");
		JMenu menu_tools = new JMenu("Tools");
		JMenu menu_app   = new JMenu("Application");
		
		menuBar.add(menu_file);
		menuBar.add(menu_tools);
		menuBar.add(menu_app);
		
		JMenuItem item_new  =  new JMenuItem("New");
		JMenuItem item_open  =  new JMenuItem("Open");
		JMenuItem item_save  =  new JMenuItem("Save");
		JMenuItem item_exit  =  new JMenuItem("Exit");
		menu_file.add( item_new);
		menu_file.add( item_open);
		menu_file.add( item_save);
		menu_file.add( item_exit);
		
		return menuBar;
	}
}