package com.fatou.demoJpa16.hibernate.demo.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fatou.demoJpa16.hibernate.demo.entity.Course;

@Repository
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}
	
	
	//public Course save(Course course)
	//public void deleteById(Long id)


}
