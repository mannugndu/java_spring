package com.naveen.dao2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import com.naveen.dao2.model.Student;

public class StudentDAOImpl implements StudentDAO{
	
	
	DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public int save(Student student) throws Exception {
		
		Connection con = ds.getConnection();
		
		PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?)");
		ps.setInt(1, student.getRollNo());
		ps.setString(2, student.getEmail());
		ps.setString(3, student.getName());
		
		int i = ps.executeUpdate();
		
		con.close();
		return i;
	}

	public boolean delete(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Student findById(Student student) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
