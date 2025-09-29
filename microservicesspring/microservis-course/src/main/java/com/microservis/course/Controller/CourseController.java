package com.microservis.course.Controller;

import com.microservis.course.Entity.Course;
import com.microservis.course.Servis.CourseServis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private CourseServis courseServis;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Course course){

        courseServis.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourse(){
        return  ResponseEntity.ok(courseServis.findAll());
    }


    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){

        return ResponseEntity.ok(courseServis.findById(id));
    }




}
