package com.labolida.explorer.gui;

import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTree;
import com.labolida.explorer.ApplicationContext;
import com.labolida.explorer.LOG;


public class PaneLeft extends JPanel {
	
	public static JTree tree = null;
	public static Icon icon = new ImageIcon("folder.png");
	public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd.hh:mm:ss");
	public static DecimalFormat numberFormat = new DecimalFormat("#,###");
	private LOG log = new LOG(this.getClass());
	
	public PaneLeft(){
		try {
			GridLayout layout = new GridLayout();
			layout.setHgap(10);
			layout.setVgap(10);
			this.setLayout( layout );
			
			ComponentTreeView beanTreeView = new ComponentTreeView();
			ApplicationContext.map.put("beanTreeView", beanTreeView);
			this.add(beanTreeView.getTreeInstance());
		} 
		catch (Exception e) {
			log.write(e, "General error");
		}
	}
}