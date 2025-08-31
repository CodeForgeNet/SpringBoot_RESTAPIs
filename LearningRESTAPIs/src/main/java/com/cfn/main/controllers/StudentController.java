package com.cfn.main.controllers;

import com.cfn.main.entities.Student;
import com.cfn.main.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student addStudentDetails(@RequestBody Student student){
        return studentService.createStd(student);
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentService.getAllStudents();
    }




}
