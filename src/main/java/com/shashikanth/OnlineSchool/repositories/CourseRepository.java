package com.shashikanth.OnlineSchool.repositories;

import com.shashikanth.OnlineSchool.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CourseRepository extends Neo4jRepository<Course,Long> {
}
