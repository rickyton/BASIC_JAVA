package com.sontm.students.ui;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.sontm.constant.utils.NumberConstant;
import com.sontm.student.models.Student;

public class TableModel extends AbstractTableModel {

	private List<Student> studentsList;
	private String[] colsNames = { "No.", "Full Name", "Address", "Course Name", "ID No.", "Mobile No." };

	public TableModel() {
		studentsList = new ArrayList<Student>();
	}

	public int getColumnCount() {

		return NumberConstant.TABLE_COL_NUMS;
	}

	public int getRowCount() {

		return studentsList.size();
	}

	public Object getValueAt(int rowIndex, int colIndex) {
		Student student = this.studentsList.get(rowIndex);
		switch (colIndex) {
		case 0:
			return student.getsOrdinalNumber();
		case 1:
			return student.getsFullName();
		case 2:
			return student.getsAddress();
		case 3:
			return student.getsCourseName();
		case 4:
			return student.getsIDNo();
		case 5:
			return student.getsMobileNo();
		default:
			return null;
		}

	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	public void updateTable() {
		fireTableDataChanged();
	}

	@Override
	public String getColumnName(int column) {
		return this.colsNames[column];
	}

}
