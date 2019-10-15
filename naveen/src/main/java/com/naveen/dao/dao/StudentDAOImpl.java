package com.naveen.dao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;
import com.naveen.dao.model.*;
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
		
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, student.getRollNo());
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		int i = ps.executeUpdate();
		
		con.close();
		return i;
	}

	public boolean update(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Student student) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public Student findByRollNo(int rollNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findByname(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Student findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
