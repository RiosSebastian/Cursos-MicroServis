package com.microservis.student.repository;

import com.microservis.student.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    @Query("SELECT s From Student s WHERE s.courseId = Idcourse")
    List<Student> findAllStudent(Long Idcourse);
}
