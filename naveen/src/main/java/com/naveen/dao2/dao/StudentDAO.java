package com.naveen.dao2.dao;

import java.util.List;

import com.naveen.dao2.model.Student;

public interface StudentDAO {
	
	int save(Student student)throws Exception;
	boolean delete(Student student)throws Exception;
	boolean update(Student student)throws Exception;
	List<Student> findByName(String name)throws Exception;
	Student findById(Student student)throws Exception;

}
