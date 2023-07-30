package com.ed.ed.modules.courses.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ed.ed.modules.courses.entities.Course;

public interface CourseJpaRepository extends JpaRepository<Course, UUID> {

    public Course findByName(String name);

}
