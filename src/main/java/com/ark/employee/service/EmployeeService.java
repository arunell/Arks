package com.ark.employee.service;

import com.ark.employee.model.Employee;

import java.util.List;

/**
 * Created by Arun on 6/20/16.
 */
public interface EmployeeService {
    Employee findById(long id);
    Employee findByLastName(String lastName);
    List<Employee> findAllEmployees();
    void saveEmployee();
    void deleteEmployeeById(long id);

}
