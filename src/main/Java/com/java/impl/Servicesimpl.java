package com.java.impl;

import com.java.Dao.DepartmentMapper;
import com.java.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicesimpl implements services {

    @Autowired
    private DepartmentMapper deprecated;

  public Department selectByPrimaryKey(String departmentId){ return deprecated.selectByPrimaryKey(departmentId); };
}
