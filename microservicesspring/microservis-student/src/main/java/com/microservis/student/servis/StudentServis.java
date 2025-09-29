package com.microservis.student.servis;

import com.microservis.student.entity.Student;

import java.util.List;

public interface StudentServis {

    List<Student> findAll();

    Student findById(Long id);

    void save (Student student);

    List <Student> findByIdcourse(Long idcourse);
}
