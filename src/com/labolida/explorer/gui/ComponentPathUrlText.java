package com.labolida.explorer.gui;

import javax.swing.JTextField;

public class ComponentPathUrlText extends JTextField {

	private JTextField pathUrl = new JTextField();
	
	public ComponentPathUrlText() {
	}
	
	public String getPath() {
		return pathUrl.getText();
	}
	
	public void setPath(String path) {
		pathUrl.setText(path);
	}
	
}
