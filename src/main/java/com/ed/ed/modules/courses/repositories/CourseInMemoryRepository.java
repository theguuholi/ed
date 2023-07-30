package com.ed.ed.modules.courses.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ed.ed.modules.courses.entities.Course;

public class CourseInMemoryRepository implements ICourseRepository {
    private List<Course> courses;

    public CourseInMemoryRepository() {
        this.courses = new ArrayList<>();
    }

    @Override
    public Course findByName(String name) {
        return this.courses
                .stream()
                .filter(course -> course.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Course save(Course course) {
        course.setId(UUID.randomUUID());
        this.courses.add(course);
        return course;
    }

}
