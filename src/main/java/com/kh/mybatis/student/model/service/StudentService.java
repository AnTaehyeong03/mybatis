package com.kh.mybatis.student.model.service;

import com.kh.mybatis.student.model.vo.Student;

public interface StudentService {

	int insertStudent(Student s);

	Student selectOneStudent(int no);

	int selectStudentCount();
}
