package com.mit.mini.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import com.mit.mini.dao.StudentDao;
import com.mit.mini.model.Student;

@Component
public class StudentServiceImpl implements StudentService {

//	@Autowired
//	StudentDao studentDao; 
	
	@Override
	public Student save(Student student) {
		
		return student;// studentDao.save(student);
	}

	@Override
	public boolean findByLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findByUserName(String userName) {
		// TODO Auto-generated method stub
		return false;
	}

}
