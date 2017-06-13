package com.github.xenteros.repository;

import com.github.xenteros.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by agurgul on 13.06.2017.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    Student findOneByUuid(String uuid);
}
