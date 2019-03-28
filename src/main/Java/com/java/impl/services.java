package com.java.impl;

import com.java.Model.Department;
import org.springframework.stereotype.Service;

@Service
public interface services {
    Department selectByPrimaryKey(String departmentId);
}
