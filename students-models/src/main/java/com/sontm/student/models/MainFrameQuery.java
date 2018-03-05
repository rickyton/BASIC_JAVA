package com.sontm.student.models;

import java.util.List;

public class MainFrameQuery {
	private DataBase database = DatabaseHandler.INSTANCE.getInstance();

	public List<Student> getAllStudents() {
		return database.getStudents();
	};
}
