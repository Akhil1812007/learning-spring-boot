package com.springboot.learningspringboot.service;

import com.springboot.learningspringboot.entity.Deparment;
import com.springboot.learningspringboot.repository.DepartmentRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DeparmentServiceInterface {
    @Autowired
    private DepartmentRepositoryInterface departmentRepository;
    @Override
    public Deparment saveDepartment(Deparment deparment) {
        return departmentRepository.save(deparment);
    }

    @Override
    public List<Deparment> getDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Deparment getDepartment(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
