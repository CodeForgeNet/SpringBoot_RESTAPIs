package com.cfn.main.controllers;

import com.cfn.main.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(4l,"Luffy","luffy@gmail.com");
    }




}
