package com.sontm.students.ui.sub;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.sontm.constant.utils.NumberConstant;
import com.sontm.constant.utils.StringConstant;
import com.sontm.student.models.Student;
import com.sontm.students.callbacks.IStudentCallBack;
import com.sontm.students.controller.IStudentDialogController;
import com.sontm.students.controllerimpl.StudentDialogControllerImpl;

public class NewStudentDialog extends JDialog implements ActionListener {
	private JButton saveButton, resetButton, closeButton;
	private JLabel jlFullName, jlAddress, jlIDNumber, jlMobileNumber, jlGender, jlCourse;
	private JTextField jtFullName, jtAddress, jtIDNumber, jtMobileNumber;
	private IStudentDialogController studentDialogController = null;
	private IStudentCallBack studentCallBack = null;

	public NewStudentDialog(JFrame parentFrame) {
		super(parentFrame, StringConstant.DIAGLOG_STUDENT_TITLE, false);
		initializeVariables();
		setWindow(parentFrame);
		initializeLayout();
	}

	private void initializeLayout() {
		JPanel studentInfoPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		Border borderSpace = BorderFactory.createEmptyBorder(15, 15, 15, 15);
		Border borderTitle = BorderFactory.createTitledBorder(StringConstant.DIAGLOG_STUDENT_SUB_TITLE);
		studentInfoPanel.setBorder(BorderFactory.createCompoundBorder(borderSpace, borderTitle));
		studentInfoPanel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridy = 0;
		Insets rightPadding = new Insets(0, 0, 0, 15);
		Insets noPadding = new Insets(0, 0, 0, 0);

		// ====first row====
		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(jlFullName, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(jtFullName, gc);

		// ======second row=====
		gc.gridy++;

		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(jlAddress, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(jtAddress, gc);

		// ======third row=====
		gc.gridy++;

		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(jlIDNumber, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(jtIDNumber, gc);

		// ======next row=====
		gc.gridy++;

		gc.gridx = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.EAST;
		gc.insets = rightPadding;
		studentInfoPanel.add(jlMobileNumber, gc);

		gc.gridx++;
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = noPadding;
		studentInfoPanel.add(jtMobileNumber, gc);

		// buttons layout
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(saveButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);

		// automatically resize the width of button
		Dimension btnSize = resetButton.getPreferredSize();// get reset button
															// to be compared
		saveButton.setPreferredSize(btnSize);
		closeButton.setPreferredSize(btnSize);

		// Bring 2 panels into form
		this.setLayout(new BorderLayout());
		this.add(studentInfoPanel, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}

	private void setWindow(JFrame parentFrame) {
		this.setSize(NumberConstant.NEW_STUDENT_DIAGLOG_WIDTH, NumberConstant.NEW_STUDENT_DIAGLOG_HEIGHT);
		this.setLocationRelativeTo(parentFrame);

	}

	private void initializeVariables() {
		saveButton = new JButton(StringConstant.BUTTON_SAVE);
		resetButton = new JButton(StringConstant.BUTTON_RESET);
		closeButton = new JButton(StringConstant.BUTTON_CLOSE);
		jlFullName = new JLabel(StringConstant.LABEL_FULLNAME);
		jlAddress = new JLabel(StringConstant.LABEL_ADDRESS);
		jlIDNumber = new JLabel(StringConstant.LABEL_IDNUMBER);
		jlMobileNumber = new JLabel(StringConstant.LABEL_PHONENUMBER);
		jlGender = new JLabel(StringConstant.LABEL_GENDER);
		jlCourse = new JLabel(StringConstant.LABEL_COURSE);

		jtFullName = new JTextField(NumberConstant.FIELD_COLS_LENGTH);
		jtAddress = new JTextField(NumberConstant.FIELD_COLS_LENGTH);
		jtIDNumber = new JTextField(NumberConstant.FIELD_COLS_LENGTH);
		jtMobileNumber = new JTextField(NumberConstant.FIELD_COLS_LENGTH);

		// add ActionListener to buttons
		saveButton.addActionListener(this);
		resetButton.addActionListener(this);
		closeButton.addActionListener(this);

		studentDialogController = new StudentDialogControllerImpl();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == closeButton) {
			this.setVisible(false);
		} else if (e.getSource() == resetButton) {
			this.jtFullName.setText(null);
			this.jtAddress.setText(null);
			this.jtIDNumber.setText(null);
			this.jtMobileNumber.setText(null);
			this.jtFullName.setFocusCycleRoot(true);
		} else if (e.getSource() == saveButton) {
			// 1.get data from add form to set new variables
			String strFullName = this.jtFullName.getText();
			String strAddress = this.jtAddress.getText();
			String strIDNumber = this.jtIDNumber.getText();
			String strMobileNumber = this.jtMobileNumber.getText();

			Student student = new Student();
			student.setsFullName(strFullName);
			student.setsAddress(strAddress);
			student.setsIDNo(strIDNumber);
			student.setsMobileNo(strMobileNumber);
			this.studentDialogController.insertStudent(student);
			this.studentCallBack.studentSave();
		}
	}

	public void setCallBack(IStudentCallBack studentCallBack) {
		this.studentCallBack = studentCallBack;
	}
}
