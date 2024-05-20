package com.spring.rest.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.rest.entity.Course;
import com.spring.rest.rest.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses() {
		return courseRepository.findAll();
	}

	public Optional<Course> getCourseById(Long id) {
		return courseRepository.findById(id);
	}

	public Course addCourse(Course course) {
		return courseRepository.save(course);
	}

	public Course updateCourse(Course course) {
		return courseRepository.save(course);
	}

	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}
}
