package com.makschornyi.springbootbootbackendapirest.repo;

import com.makschornyi.springbootbootbackendapirest.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseDao extends CrudRepository<Course, Long> {
}
