package com.ed.ed.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.ed.ed.modules.courses.entities.Course;
import com.ed.ed.modules.courses.repositories.CourseInMemoryRepository;
import com.ed.ed.modules.courses.services.CreateCourseService;

public class CreateCourseServiceTest {

    @Test
    public void shouldBeAbleToCreateANewCourse() {
        Course course = new Course();
        course.setDescription("Description test");
        course.setName("Name test");
        course.setWorkload(100);

        CreateCourseService createCourseService = new CreateCourseService(new CourseInMemoryRepository());
        Course createCourse  = createCourseService.execute(course);

        assertNotNull(createCourse.getId());

    }
}
