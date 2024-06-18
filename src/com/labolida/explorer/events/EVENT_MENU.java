package com.labolida.explorer.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EVENT_MENU implements ActionListener{

	public void actionPerformed(ActionEvent actionEvent) {
		String command = actionEvent.getActionCommand();  //Hello World!
		System.out.println( "EVENT_MENU.actionPerformed(): actionEvent.command=" + command );
	}
}