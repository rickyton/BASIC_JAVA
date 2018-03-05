package com.sontm.student.models;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	private List<Student> students;

	public DataBase() {
		students = new ArrayList<Student>();
		this.students
				.add(new Student("1", "Ricky Martin", "1229 New North Road", "Java core", "021358432", "0986555999"));
		this.students.add(new Student("2", "Lindsey Lohan", "130 Pitt Street", "Java core", "046788347", "0986111333"));
		this.students.add(new Student("3", "Colin England", "180 K' Road", "Java core", "048882442", "0986467123"));
		this.students
				.add(new Student("4", "Micheal Blot", "1457 Queen Street", "Java core", "3249844883", "0986745980"));
		this.students.add(new Student("5", "Chuck Chris", "1368 Wyndham", "Java core", "46788237644", "0986123654"));
		this.students.add(new Student("6", "Radka Skova", "489 Victory", "Java core", "876367233", "0986087345"));

		// =================

	}

	public List<Student> getStudents() {
		return students;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void removeStudent(Student student) {
		this.students.remove(student);
	}

}
