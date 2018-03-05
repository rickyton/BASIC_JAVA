package com.sontm.student.models;

public class StudentAdditionQuery {
	DataBase database = DatabaseHandler.INSTANCE.getInstance();

	public void insertStudent(Student student) {
		this.database.addStudent(student);
	}
}
