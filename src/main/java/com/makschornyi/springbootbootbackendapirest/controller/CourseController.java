package com.makschornyi.springbootbootbackendapirest.controller;


import com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces.ICourseService;
import com.makschornyi.springbootbootbackendapirest.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CourseController {

    private final ICourseService courseService;

    @Autowired
    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("courses")
    public List<Course> findAll() {
        return courseService.findAll();
    }
}
