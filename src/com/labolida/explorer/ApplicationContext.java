package com.labolida.explorer;

import com.labolida.explorer.gui.ComponentPathUrlText;
import com.labolida.explorer.gui.ComponentTableViewFiles;
import com.labolida.explorer.gui.ComponentTreeView;

public class ApplicationContext {

	static {
		System.out.println("IOC Inversion of controll - instance at application context.");
	}
	
	public static ComponentPathUrlText componentPathUrlText = new ComponentPathUrlText();
	public static ComponentTreeView componentTreeView = new ComponentTreeView("/");
	public static ComponentTableViewFiles componentTableViewFiles = new ComponentTableViewFiles();
}