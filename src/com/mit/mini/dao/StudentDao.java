package com.mit.mini.dao;

import com.mit.mini.model.Student;

public interface StudentDao {
	Student save(Student student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
