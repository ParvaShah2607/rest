package com.spring.rest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.rest.rest.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
