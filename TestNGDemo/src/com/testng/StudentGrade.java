package com.testng;

public class StudentGrade {
		// TODO Auto-generated method stub
	public char calculateGrade(Student student) {
		if (student.getTotalMarks()>90) {
			return 'A';
		}
		else if(student.getTotalMarks()>75 && student.getTotalMarks()<=90) {
			return 'B';
		}
		else if(student.getTotalMarks()>60 && student.getTotalMarks()<=75) {
			return 'C';
		}
		else {
			return 'F';
		}
	}
}
