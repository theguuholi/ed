package com.ed.ed.modules.courses.repositories;

import com.ed.ed.modules.courses.entities.Course;

public interface ICourseRepository {
    public Course findByName(String name);

    public Course save(Course course);
}
