package com.labolida.explorer.events;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import com.labolida.explorer.ApplicationContext;


public class EVENT_MOUSE_TREE implements TreeSelectionListener {

	
	public void valueChanged(TreeSelectionEvent e) {
		
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) ApplicationContext.componentTreeView.getTreeInstance().getLastSelectedPathComponent();
		
		String path = ApplicationContext.componentTreeView.getPathFromSelectedNode();
		
		ApplicationContext.componentPathUrlText.setText(path);
		
		ApplicationContext.componentTreeView.recursiveLoadFileNodesOnTree( node , path ) ;
		
		ApplicationContext.componentTreeView.loadListFilesFromPath ( path );
	}
}