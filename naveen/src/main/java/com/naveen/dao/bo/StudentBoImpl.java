package com.naveen.dao.bo;

import com.naveen.dao.dao.StudentDAO;
import com.naveen.dao.model.Student;

public class StudentBoImpl implements StudentBo{
	
	
	StudentDAO studentdao;
	
	

	public StudentDAO getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(StudentDAO studentdao) {
		this.studentdao = studentdao;
	}

	public int createStudent(Student student) throws Exception {
		return studentdao.save(student);
		
	}

	public boolean updateStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteStudent(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
