package com.sontm.students.controllerimpl;

import java.util.List;

import com.sontm.student.models.MainFrameQuery;
import com.sontm.student.models.Student;
import com.sontm.students.controller.IMainFrameController;

public class MainFrameControllerImpl implements IMainFrameController {
	private MainFrameQuery mainFrameQuery;

	public MainFrameControllerImpl() {
		mainFrameQuery = new MainFrameQuery();
	}

	public List<Student> getAllStudents() {

		return this.mainFrameQuery.getAllStudents();
	}

}
