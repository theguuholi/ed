package com.ed.ed.modules.courses.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ed.ed.modules.courses.entities.Course;
import com.ed.ed.modules.courses.repositories.CourseRepository;
import com.ed.ed.modules.courses.services.CreateCourseService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private CourseRepository repository;

    @PostMapping(value = "/")
    public Course postMethodName(@RequestBody Course entity) {
        return new CreateCourseService(repository).execute(entity);
    }

}
