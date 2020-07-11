package com.jts.project;

import java.util.ArrayList;
import java.util.List;

public class StudentDAL {

	static List<Student> studentList;
	
	static {
		studentList = new ArrayList<Student>();
	}
	
	public String addStudentDal(Student student) {
		studentList.add(student);
		return "Student Record added...";
	}
	
	public List<Student> showStudentDal() {
		return studentList;
	}
	
	public Student searchStudentDal(int sno) {
		Student studentFound = null;
		for (Student student : studentList) {
			if (student.getSno() == sno) {
				studentFound = student;
			}
		}
		return studentFound;
	}
	
	public String updateStudentDal(Student studentUpdated) {
		String result = "Record Not Found...";
		for (Student student : studentList) {
			if (student.getSno() == studentUpdated.getSno()) {
				student.setName(studentUpdated.getName());
				student.setCity(studentUpdated.getCity());
				student.setCgp(studentUpdated.getCgp());
				result = "Student Record Updated...";
			} 
		}
		return result;
	}

	public String deleteStudentDal(int sno) {
		Student studentFound = searchStudentDal(sno);
		if (studentFound != null) {
			studentList.remove(studentFound);
			return "Student Record Deleted...";
		} else {
			return "Student Record Not Found to Delete...";
		}
	}

}
