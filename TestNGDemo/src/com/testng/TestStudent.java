package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestStudent {
	StudentGrade sgrade = new StudentGrade();
	Student student = new Student();
	
	public void testStudentGrade() {
		student.setName("Rohan");
		student.setTotalMarks(79);
		student.setGender("Male");
		
		char grade = sgrade.calculateGrade(student);
		Assert.assertEquals('B', grade);
	}
}
