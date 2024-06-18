package com.labolida.explorer.events;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import com.labolida.explorer.ApplicationContext;
import com.labolida.explorer.gui.ComponentPathUrlText;
import com.labolida.explorer.gui.ComponentTreeView;

public class EVENT_MOUSE_TREE implements TreeSelectionListener {
	
	public void valueChanged(TreeSelectionEvent e) {
		
		ComponentTreeView componentTreeView = (ComponentTreeView) ApplicationContext.map.get("beanTreeView");
		
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) componentTreeView.getTreeInstance().getLastSelectedPathComponent();
		
		String path = componentTreeView.getPathFromSelectedNode();
		
		ComponentPathUrlText beanPath = (ComponentPathUrlText) ApplicationContext.map.get("beanPath");
		beanPath.setText(path);
		
		componentTreeView.recursiveLoadFileNodesOnTree( node , path ) ;
		
		componentTreeView.loadListFilesFromPath ( path );
	}
}