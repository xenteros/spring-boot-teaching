package com.github.xenteros.service;

import com.github.xenteros.dto.StudentDTO;
import com.github.xenteros.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by agurgul on 13.06.2017.
 */

@Service
public interface StudentService {

    List<Student> findAll();
    Student findOne(String uuid);
    Student create(StudentDTO studentDTO);
}
