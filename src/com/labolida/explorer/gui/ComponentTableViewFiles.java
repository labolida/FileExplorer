package com.labolida.explorer.gui;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ComponentTableViewFiles extends JComponent {
	
	public DefaultTableModel model = new DefaultTableModel();
	public JTable jtable = new JTable(model);
	public JScrollPane scrollPane= new JScrollPane(jtable);
	
	public ComponentTableViewFiles() {
		model.addColumn("Type");
		model.addColumn("Name");
		model.addColumn("Size");
		model.addColumn("Date");
		model.addColumn("Owner");
		model.addColumn("Permission");
		
		String row[] = {};
		model.addRow( row );
		
		jtable.setEnabled(true);
		jtable.setAutoResizeMode(1);
		jtable.setAutoCreateRowSorter(true);
		JTableHeader header = jtable.getTableHeader();
		header.setReorderingAllowed(true);
		
		
		jtable.getColumnModel().getColumn(0).setPreferredWidth(10);
		jtable.getColumnModel().getColumn(1).setPreferredWidth(500);
		jtable.getColumnModel().getColumn(2).setPreferredWidth(80);
		jtable.getColumnModel().getColumn(3).setPreferredWidth(80);
		jtable.getColumnModel().getColumn(4).setPreferredWidth(10);
		jtable.getColumnModel().getColumn(5).setPreferredWidth(10);
		
		Style.render(jtable);
	}
	
	public Component getInstanceMainComponent() {
		return scrollPane;
	}
	
}
