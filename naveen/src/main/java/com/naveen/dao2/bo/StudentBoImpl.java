package com.naveen.dao2.bo;

import com.naveen.dao2.dao.StudentDAO;
import com.naveen.dao2.model.Student;

public class StudentBoImpl implements StudentBo{

	StudentDAO studentdao;
	
	public StudentDAO getStudentdao() {
		return studentdao;
	}

	public void setStudentdao(StudentDAO studentdao) {
		this.studentdao = studentdao;
	}

	public int create(Student student){
		try {
		return studentdao.save(student);
		}catch(Exception e) {}
		return 0;
		
	}

	public boolean update(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}
