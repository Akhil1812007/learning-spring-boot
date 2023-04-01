package com.springboot.learningspringboot.controller;

import com.springboot.learningspringboot.entity.Deparment;
import com.springboot.learningspringboot.repository.DepartmentRepositoryInterface;
import com.springboot.learningspringboot.service.DeparmentServiceInterface;
import com.springboot.learningspringboot.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DeparmentServiceInterface departmentService;
    @PostMapping("/departments")

    public Deparment saveDepartment(@RequestBody Deparment deparment){

        return departmentService.saveDepartment(deparment);
    }
    @GetMapping("/departments")
    public List<Deparment> getallDepartmrntList(){
        return departmentService.getDepartmentList();
    }
    @GetMapping("/departments/{id}")

    public Deparment getDepartment(@PathVariable("id") Long departmentId){
        return departmentService.getDepartment( departmentId);
    }
}
