package com.sontm.student.models;

public enum DatabaseHandler {
	INSTANCE;
	private DataBase database = new DataBase();

	public DataBase getInstance() {
		return database;
	}
}
