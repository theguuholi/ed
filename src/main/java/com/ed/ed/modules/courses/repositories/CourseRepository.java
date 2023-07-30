package com.ed.ed.modules.courses.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ed.ed.modules.courses.entities.Course;

@Service
public class CourseRepository implements ICourseRepository {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public Course findByName(String name) {
        return this.repository.findByName(name);
    }

    @Override
    public Course save(Course course) {
        return this.repository.save(course);
    }

}
