package com.cfn.main.services;

import com.cfn.main.entities.Student;

import java.util.List;

public interface StudentService {

    public Student createStd(Student student);
    public List<Student> getAllStudents();

}
