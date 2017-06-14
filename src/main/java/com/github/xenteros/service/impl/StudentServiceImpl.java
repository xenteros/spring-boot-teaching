package com.github.xenteros.service.impl;

import com.github.xenteros.dto.StudentDTO;
import com.github.xenteros.mapper.StudentMapper;
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

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentDTO> findAll() {
        return studentMapper.toStudentDTOList(studentRepository.findAll());
    }

    @Override
    public StudentDTO findOne(String uuid) {
        return studentMapper.toStudentDTO(studentRepository.findOneByUuid(uuid));
    }

    @Override
    public StudentDTO create(StudentDTO studentDTO) {

        Student newStudent = studentMapper.toStudent(studentDTO);
        newStudent.setUuid(UUID.randomUUID().toString());

        return studentMapper.toStudentDTO(studentRepository.save(newStudent));
    }
}
