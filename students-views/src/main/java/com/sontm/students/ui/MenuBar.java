package com.sontm.students.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.sontm.constant.utils.StringConstant;
import com.sontm.students.callbacks.IStudentCallBack;
import com.sontm.students.ui.sub.NewStudentDialog;

public class MenuBar extends JMenuBar implements ActionListener, IStudentCallBack {
	private JMenu fileMenu = null;
	private JMenuItem open = null;
	private JMenuItem exit = null;

	// ==============

	private JMenu studentMenu = null;
	private JMenuItem addStudent = null;
	private JMenuItem removeStudent = null;

	// ==============

	private NewStudentDialog newStudentDialog = null;
	private MainFrame mainFrame = null;

	public MenuBar(MainFrame parentFrame) {
		fileMenu = new JMenu(StringConstant.MAIN_MENU_FILE);
		open = new JMenuItem(StringConstant.MAIN_MENU_OPEN);
		exit = new JMenuItem(StringConstant.MAIN_MENU_EXIT);
		fileMenu.add(open);
		fileMenu.add(exit);
		this.add(fileMenu);

		studentMenu = new JMenu(StringConstant.MAIN_MENU_STUDENT);
		addStudent = new JMenuItem(StringConstant.MAIN_MENU_ADD_STUDENT);
		removeStudent = new JMenuItem(StringConstant.MAIN_MENU_REMOVE_STUDENT);
		studentMenu.add(addStudent);
		studentMenu.add(removeStudent);
		this.add(studentMenu);

		exit.addActionListener(this);
		open.addActionListener(this);
		addStudent.addActionListener(this);
		removeStudent.addActionListener(this);

		newStudentDialog = new NewStudentDialog(parentFrame);
		mainFrame = parentFrame;
		setCallBack();
	}

	private void setCallBack() {
		this.newStudentDialog.setCallBack(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == exit) {
			int action = JOptionPane.showConfirmDialog(getParent(), StringConstant.EXIT_CONFIRMATION_CONTENT,
					StringConstant.EXIT_CONFIRMATION_TITLE, JOptionPane.OK_CANCEL_OPTION);
			if (action == JOptionPane.OK_OPTION) {
				System.gc(); // exit confirmation
				System.exit(0); // exit application
			}
		} else if (e.getSource() == addStudent) {
			newStudentDialog.setVisible(true);
		}
	}

	public void studentSave() {
		this.mainFrame.setStudents();
	}

}
