package com.microservis.course.Servis;

import com.microservis.course.Entity.Course;

import java.util.List;

public interface CourseServis {
    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);
}
