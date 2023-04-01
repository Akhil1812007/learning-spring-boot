package com.springboot.learningspringboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deparment {
    public Deparment(Long deparmentId, String departmentName, String departmentAddress, String departmentCode) {
        this.deparmentId = deparmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deparmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public Deparment() {
    }

    @Override
    public String toString() {
        return "Deparment{" +
                "deparmentId=" + deparmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }



    public void setDeparmentId(Long deparmentId) {
        this.deparmentId = deparmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public Long getDeparmentId() {
        return deparmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }



}
