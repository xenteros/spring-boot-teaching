package com.github.xenteros.mapper;

import com.github.xenteros.dto.StudentDTO;
import com.github.xenteros.model.Student;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Created by agurgul on 14.06.2017.
 */
@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentDTO toStudentDTO(Student student);
    Student toStudent(StudentDTO studentDTO);

    List<StudentDTO> toStudentDTOList(List<Student> students);
    List<Student> toStudentList(List<StudentDTO> studentDTOS);
}
