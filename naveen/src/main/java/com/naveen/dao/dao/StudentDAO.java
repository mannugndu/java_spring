package com.naveen.dao.dao;

import java.util.List;

import com.naveen.dao.model.*;
public interface StudentDAO {
	
	int save(Student student)throws Exception;
	boolean update(Student student)throws Exception;
	boolean delete(Student student)throws Exception;
	Student findByRollNo(int rollNo)throws Exception;
	List<Student> findByname(String name)throws Exception;
	Student findByEmail(String email)throws Exception;
	List<Student> findAll()throws Exception;

}
