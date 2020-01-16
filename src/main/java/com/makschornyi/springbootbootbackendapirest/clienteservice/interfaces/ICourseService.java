package com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces;

import com.makschornyi.springbootbootbackendapirest.model.Course;

import java.util.List;


public interface ICourseService {
    List<Course> findAll();
}
