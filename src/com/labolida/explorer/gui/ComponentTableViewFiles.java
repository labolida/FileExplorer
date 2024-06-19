package com.labolida.explorer.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.sun.java.swing.plaf.motif.MotifBorders;

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
		
		jtable.setAutoResizeMode(1);
		jtable.setAutoCreateRowSorter(true);
		///JTableHeader header = jtable.getTableHeader();
		///header.setReorderingAllowed(true);
		
		/*
		jtable.setBackground( new Color(200,200,200) );
		jtable.setForeground( new Color(50,50,50) );
		jtable.setGridColor( new Color(50,50,250) );
		Font font= new Font("Courier", Font.PLAIN, 16);
		jtable.setFont(font);
		jtable.setRowHeight(40);
		*/
		Style.render(jtable);
		
	}
	
}


