package com.labolida.explorer;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import com.labolida.explorer.events.EVENT_EXIT;
import com.labolida.explorer.gui.ContainerCenter;
import com.labolida.explorer.gui.ContainerNorth;
import com.labolida.explorer.gui.ContainerSouth;
import com.labolida.explorer.gui.ComponentMenu;

public class Startup extends JFrame {
	
	public static void main(String[] args) {
		new Startup();
	}
	
	public Startup() {
		this.setTitle("Explorer version 1.0 Java.v.1.8 +Swing by leonardo.labolida.com");
		this.addWindowListener( new EVENT_EXIT() );
		BorderLayout layout = new BorderLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		this.setLayout( layout );
		this.setSize(1400, 720);
		this.setLocation(100, 100);
		this.setJMenuBar( ComponentMenu.getMenuBar()  );
		
		ContainerNorth containerNorth = new ContainerNorth();
		ContainerCenter containerCenter = new ContainerCenter();
		ContainerSouth containerSouth = new ContainerSouth();
		
		this.add( containerNorth   , BorderLayout.NORTH   );
		this.add( containerCenter  , BorderLayout.CENTER  );
		this.add( containerSouth   , BorderLayout.SOUTH   );
		
		this.setVisible(true);
	}
	
}
