package com.labolida.explorer.gui;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.UserPrincipal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;
import com.labolida.explorer.ApplicationContext;
import com.labolida.explorer.LOG;
import com.labolida.explorer.events.EVENT_MOUSE_TREE;


public class ComponentTreeView extends JComponent {

	
	private Icon icon = new ImageIcon("folder.png");
	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd.hh:mm:ss");
	private DecimalFormat numberFormat = new DecimalFormat("#,###");
	private JTree tree ;
	private LOG log = new LOG(this.getClass());	

	
	public ComponentTreeView() {
		
		String path = new String("/area6/tmp");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode(path);
		recursiveLoadFileNodesOnTree( root , path );
		tree = new JTree(root);
		tree.addTreeSelectionListener( new EVENT_MOUSE_TREE() );    // EVENT
		DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
		renderer.setOpenIcon(icon);
	    renderer.setClosedIcon(icon);
	    renderer.setLeafIcon(icon);
	    tree.setCellRenderer(renderer);
		
		JScrollPane scroll = new JScrollPane( tree ) ;
		this.add(scroll);
	}
	
	public JTree getTreeInstance() {
		return tree;
	}

	public String getPathFromSelectedNode(){
		TreePath tp =  tree.getSelectionPath();
		Object [] obj = tp.getPath();
		String sPath = new String();
		for (int i = 0; i < obj.length; i++) {
			sPath= sPath + obj[i] + "/";
		}
		return sPath;
	}
	

	public void recursiveLoadFileNodesOnTree( DefaultMutableTreeNode treeNode , String path) {
		File filePath = new File(path);
		String [] fileNames = filePath.list();
		for (int x=0; x<fileNames.length; x++){
			File file = new File( path+fileNames[x] );
			if (file.isDirectory()) {
				DefaultMutableTreeNode node = new DefaultMutableTreeNode();
				node.setUserObject( new String(file.getName() ) );
				treeNode.add(node);
			}
		}
	}
	
	
	public void loadListFilesFromPath(String path ){
		try{
			
			ComponentTableViewFiles beanTable = (ComponentTableViewFiles) ApplicationContext.map.get("beanTable");
			
			File file  = new File(path);
			File files[] = file.listFiles();

			while ( beanTable.model.getRowCount() > 0 ) {
				beanTable.model.removeRow(0);
			}

			for (int i=0; i<files.length; i++ ) {
				String row[] = new String[9];
				
				String type="Directory";
				if ( files[i].isFile() ) type="File";
				row[0]=type;
				
				row[1]=files[i].getName();
 
				String size = numberFormat.format(files[i].length());
				row[2]=  size +" bytes";
				
				row[3] = dateFormat.format( files[i].lastModified() );
				row[4] = dateFormat.format( files[i].lastModified() );

				UserPrincipal owner =	Files.getOwner( files[i].toPath() ) ;
				String ownersName = owner.getName();
				row[5] = ownersName;
				
				String permission = new String();
				if ( files[i].canExecute() ) permission+="X";
				if ( files[i].canWrite() ) permission+="W";
				if ( files[i].canRead() ) permission+="R";
				row[6] = permission ;
				
				beanTable.model.addRow(row);
			}
		}
		catch(Exception e){
			log.write(e, " (event) loading files and attributes to insert into the table");
		}
	}
	
}