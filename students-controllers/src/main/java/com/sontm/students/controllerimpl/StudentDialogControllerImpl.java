package com.sontm.students.controllerimpl;

import com.sontm.student.models.Student;
import com.sontm.student.models.StudentAdditionQuery;
import com.sontm.students.controller.IStudentDialogController;

public class StudentDialogControllerImpl implements IStudentDialogController {
	private StudentAdditionQuery studentAdditionQuery = new StudentAdditionQuery();

	public void insertStudent(Student student) {
		this.studentAdditionQuery.insertStudent(student);
	}

}
