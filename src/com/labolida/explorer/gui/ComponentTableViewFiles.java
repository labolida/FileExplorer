package com.labolida.explorer.gui;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ComponentTableViewFiles extends JComponent {
	
	public DefaultTableModel model = new DefaultTableModel();
	public JTable jtable = new JTable(model);
	public JScrollPane scrollPane= new JScrollPane(jtable);
	
	public ComponentTableViewFiles() {
		model.addColumn("Type");
		model.addColumn("Name");
		model.addColumn("Size");
		model.addColumn("Date");
		model.addColumn("ModiffiedDate");
		model.addColumn("Owner");
		model.addColumn("Permission");
		
		String row[] = {};
		model.addRow( row );
	}
}