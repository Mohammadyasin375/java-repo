package com.mybootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybootapp.model.StudentCourse;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long>{

}
