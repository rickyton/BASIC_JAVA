package com.sontm.students.ui;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sontm.constant.utils.StringConstant;
import com.sontm.students.ui.sub.NewStudentDialog;

public class TableButton extends JPanel {
	private FlowLayout flowLayout = null;
	private JButton addButton = null;
	private JButton editButton = null;
	private JButton deleteButton = null;
	private JButton closeButton = null;
	private NewStudentDialog newStudentDialog = null;

	public TableButton() {
		initializeLayout();
	}

	private void initializeLayout() {
		flowLayout = new FlowLayout();
		addButton = new JButton(StringConstant.BUTTON_ADD);
		editButton = new JButton(StringConstant.BUTTON_EDIT);
		deleteButton = new JButton(StringConstant.BUTTON_DELETE);
		closeButton = new JButton(StringConstant.BUTTON_CLOSE);

		this.setLayout(flowLayout);
		this.setBorder(new EmptyBorder(10, 30, 40, 30));
		this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		// set background for buttons
		addButton.setBackground(Color.BLUE.darker());
		editButton.setBackground(Color.BLUE.darker());
		deleteButton.setBackground(Color.BLUE.darker());
		closeButton.setBackground(Color.BLUE.darker());

		this.add(addButton);
		this.add(editButton);
		this.add(deleteButton);
		this.add(closeButton);

	}

}
