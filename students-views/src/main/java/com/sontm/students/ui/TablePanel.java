package com.sontm.students.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

import com.sontm.student.models.Student;

public class TablePanel extends JPanel {
	private TableModel tableModel;
	private JTable studentTable;

	public TablePanel() {
		intializeTableSettings();
		initializeLayout();
		initializeHeaderAlignment();
		initializeTableAlignment();
	}

	private void initializeTableAlignment() {
		DefaultTableCellRenderer tableCellRenderer = new DefaultTableCellRenderer();
		tableCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		this.studentTable.getColumnModel().getColumn(0).setCellRenderer(tableCellRenderer);
		this.studentTable.getColumnModel().getColumn(1).setCellRenderer(tableCellRenderer);
		this.studentTable.getColumnModel().getColumn(2).setCellRenderer(tableCellRenderer);
		this.studentTable.getColumnModel().getColumn(3).setCellRenderer(tableCellRenderer);
		this.studentTable.getColumnModel().getColumn(4).setCellRenderer(tableCellRenderer);
		this.studentTable.getColumnModel().getColumn(5).setCellRenderer(tableCellRenderer);
	}

	private void initializeHeaderAlignment() {
		DefaultTableCellRenderer headerCellRenderer = new DefaultTableCellRenderer();
		headerCellRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		headerCellRenderer.setBackground(Color.CYAN);
		this.studentTable.getTableHeader().setDefaultRenderer(headerCellRenderer);
	}

	private void intializeTableSettings() {
		tableModel = new TableModel();
		studentTable = new JTable(tableModel);
	}

	public void initializeLayout() {
		this.setLayout(new BorderLayout());
		this.setBorder(new EmptyBorder(10, 30, 10, 30));
		this.add(new JScrollPane(studentTable), BorderLayout.NORTH);
	}

	public void updateTable() {
		this.tableModel.updateTable();
	}

	public TableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(List<Student> studentsList) {
		this.tableModel.setStudentsList(studentsList);
	}

}
