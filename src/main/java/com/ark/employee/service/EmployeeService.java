package com.ark.employee.service;

import com.ark.employee.model.Employee;

import java.util.List;

/**
 * Created by Arun on 6/20/16.
 */
public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee findById(long id);
    Employee findByLastName(String lastName);
    void saveEmployee();
    void deleteEmployeeById(long id);

}
