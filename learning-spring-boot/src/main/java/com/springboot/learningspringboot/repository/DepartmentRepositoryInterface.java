package com.springboot.learningspringboot.repository;

import com.springboot.learningspringboot.entity.Deparment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface DepartmentRepositoryInterface extends JpaRepository<Deparment,Long> {

}
