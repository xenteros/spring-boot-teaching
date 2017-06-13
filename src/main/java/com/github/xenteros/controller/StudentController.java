package com.github.xenteros.controller;

import com.github.xenteros.dto.StudentDTO;
import com.github.xenteros.model.Student;
import com.github.xenteros.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by agurgul on 13.06.2017.
 */
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/create", method = POST)
    public Student create(@RequestBody StudentDTO studentDTO) {
        return studentService.create(studentDTO);
    }

    @RequestMapping(value = "/all", method = GET)
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
