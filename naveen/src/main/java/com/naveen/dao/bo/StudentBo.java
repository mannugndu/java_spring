package com.naveen.dao.bo;
import com.naveen.dao.model.Student;
public interface StudentBo {
	
	int createStudent(Student student)throws Exception;
	boolean updateStudent(Student student)throws Exception;
	boolean deleteStudent(Student student)throws Exception;
}
