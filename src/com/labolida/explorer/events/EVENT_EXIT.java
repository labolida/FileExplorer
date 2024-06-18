package com.labolida.explorer.events;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EVENT_EXIT extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}