package com.jts.project;

import java.util.List;

public class StudentBAL {
	
	static StringBuilder sb;
	
	public boolean validStudent(Student student) {
		sb = new StringBuilder("");
		boolean isValid = true;
		if (student.getSno() <= 0) {
			sb.append("Student No Cannot be Negative or Zero");
			isValid = false;
		}
		if (student.getName().length() <= 3) {
			sb.append("Student Name contains min. 3 chars");
			isValid = false;
		}
		if (student.getCity().length() <= 3) {
			sb.append("City Contains min. 3 characters...");
			isValid = false;
		}
		if (student.getCgp() <= 0) {
			sb.append("Cgp Cannot be Zero or Negative...");
			isValid = false;
		}
		return isValid;
	}
	
	public String addStudentBal(Student student) throws StudentException {
		if (validStudent(student)==true) {
			return new StudentDAL().addStudentDal(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}
	
	public List<Student> showStudentBal() {
		StudentDAL dal = new StudentDAL();
		return dal.showStudentDal();
	}
	
	public Student searchStudentBal(int sno) {
		StudentDAL dal = new StudentDAL();
		return dal.searchStudentDal(sno);
	}

	public String updateStudentBal(Student student) throws StudentException {
		if (validStudent(student) == true) {
			StudentDAL dal = new StudentDAL();
			return dal.updateStudentDal(student);
		} else {
			throw new StudentException(sb.toString());
		}
	}

	public String deleteStudentBal(int sno) {
		StudentDAL dal = new StudentDAL();
		return dal.deleteStudentDal(sno);
	}

}
