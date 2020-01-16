package com.makschornyi.springbootbootbackendapirest.clienteservice;

import com.makschornyi.springbootbootbackendapirest.clienteservice.interfaces.ICourseService;
import com.makschornyi.springbootbootbackendapirest.model.Course;
import com.makschornyi.springbootbootbackendapirest.repo.ICourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService {

    private final ICourseDao courseDao;

    @Autowired
    public CourseService(ICourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseDao.findAll();
    }
}
