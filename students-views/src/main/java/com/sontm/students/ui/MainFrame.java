package com.sontm.students.ui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;

import com.sontm.constant.utils.NumberConstant;
import com.sontm.constant.utils.StringConstant;
import com.sontm.student.models.Student;
import com.sontm.students.controller.IMainFrameController;
import com.sontm.students.controllerimpl.MainFrameControllerImpl;

public class MainFrame extends JFrame {
	private IMainFrameController mainFrameController;
	private TablePanel tablePanel;
	private TableButton tableButton;
	private StatusPanel statusPanel;

	public MainFrame() {
		super(StringConstant.APP_NAME);
		initializeWindowsApp();
		setJMenuBar(new MenuBar(this));
		initializeVariables();
		initializeLayout();
		setStudents();
	}

	public void setStudents() {
		List<Student> students = this.mainFrameController.getAllStudents();
		this.tablePanel.setTableModel(students);
		this.tablePanel.updateTable();
	}

	private void initializeLayout() {
		this.setLayout(new BorderLayout());
		this.add(tablePanel, BorderLayout.NORTH);
		// this.add(tableButton, BorderLayout.SOUTH);
		this.add(statusPanel, BorderLayout.SOUTH);
	}

	private void initializeVariables() {
		mainFrameController = new MainFrameControllerImpl();
		tablePanel = new TablePanel();
		tableButton = new TableButton();
		statusPanel = new StatusPanel();
	}

	private void initializeWindowsApp() {
		this.setSize(NumberConstant.APP_WINDOWS_WIDTH, NumberConstant.APP_WINDOWS_HEIGHT);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
