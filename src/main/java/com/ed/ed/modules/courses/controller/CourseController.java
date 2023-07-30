package com.ed.ed.modules.courses.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ed.ed.modules.courses.entities.Course;
import com.ed.ed.modules.courses.services.CreateCourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CreateCourseService service;

    @PostMapping(value="/")
    public Course postMethodName(@RequestBody Course entity) {
        return this.service.execute(entity);
    }
    
    
}
