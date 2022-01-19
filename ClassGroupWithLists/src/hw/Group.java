package hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
	private final String name;
	private List<Student> students = new ArrayList<Student>();
	private int places;

	public Group(String name, int places) {
		this.name = name;
		this.places = places;
	}

	public void addStudent(Student student) {
		try {
			if (students.size() >= places) {
				throw new TheGroupIsFullException();
			} else {
				students.add(student);
			}
		} catch (TheGroupIsFullException e) {
			System.err.println(e.getMessage());
		}
	}

	public void removeStudent(String secondName) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getSecondName().equals(secondName)) {
				students.remove(i);
				return;
			}
		}
		System.out.println("Такого студента нет");
	}

	public String toString() {
		Collections.sort(students, new CompareBySecondName());
		//students.sort(new CompareBySecondName());
		return "Group " + this.name + ": " + students;
	}
}
