package com.ed.ed.modules.courses.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ed.ed.modules.courses.entities.Course;
import com.ed.ed.modules.courses.repositories.CourseJpaRepository;
import com.ed.ed.modules.courses.repositories.ICourseRepository;

@Service
public class CreateCourseService {

    private ICourseRepository repository;

    public CreateCourseService(ICourseRepository repository) {
        this.repository = repository;
    }

    public Course execute(Course course) {
        Course existedCourse = this.repository.findByName(course.getName());

        if (existedCourse != null) {
            throw new Error("Curso ja existe");
        }

        return repository.save(course);
    }

}
