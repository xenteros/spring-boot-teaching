package com.github.xenteros.service.impl;

import com.github.xenteros.dto.StudentDTO;
import com.github.xenteros.model.Student;
import com.github.xenteros.repository.StudentRepository;
import com.github.xenteros.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by agurgul on 13.06.2017.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findOne(String uuid) {
        return studentRepository.findOneByUuid(uuid);
    }

    @Override
    public Student create(StudentDTO studentDTO) {

        Student newStudent = new Student();
        newStudent.setFirstName(studentDTO.getFirstName());
        newStudent.setLastName(studentDTO.getLastName());
        newStudent.setUuid(UUID.randomUUID().toString());

        return studentRepository.save(newStudent);
    }
}
