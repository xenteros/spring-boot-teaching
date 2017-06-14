package com.github.xenteros.service;

import com.github.xenteros.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by agurgul on 13.06.2017.
 */

@Service
public interface StudentService {

    List<StudentDTO> findAll();
    StudentDTO findOne(String uuid);
    StudentDTO create(StudentDTO studentDTO);
}
