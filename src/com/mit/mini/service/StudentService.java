package com.mit.mini.service;

import com.mit.mini.model.Student;



public interface StudentService {
	Student save(Student student);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
}
