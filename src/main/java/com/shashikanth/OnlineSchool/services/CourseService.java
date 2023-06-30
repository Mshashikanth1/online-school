package com.shashikanth.OnlineSchool.services;

import com.shashikanth.OnlineSchool.models.Course;
import com.shashikanth.OnlineSchool.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    public Course addCourses(Course course){
        return courseRepository.save(course);
    }
}
