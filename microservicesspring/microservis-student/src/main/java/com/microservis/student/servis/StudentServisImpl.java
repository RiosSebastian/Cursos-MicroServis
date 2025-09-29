package com.microservis.student.servis;

import com.microservis.student.entity.Student;
import com.microservis.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServisImpl implements  StudentServis{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findByIdcourse(Long idcourse) {
        return  studentRepository.findAllStudent(idcourse);
    }
}
