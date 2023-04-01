package com.springboot.learningspringboot.service;

import com.springboot.learningspringboot.entity.Deparment;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeparmentServiceInterface {
    Deparment saveDepartment(Deparment deparment);

    List<Deparment> getDepartmentList();

    Deparment getDepartment(Long departmentId);
}
