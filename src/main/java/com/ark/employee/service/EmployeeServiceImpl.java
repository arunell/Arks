package com.ark.employee.service;

import com.ark.employee.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arun on 6/20/16.
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employeeList;

    @PostConstruct
    public void postConstruct(){
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(100L,"Tom","Jerry",1000.00));
        employeeList.add(new Employee(101L,"Tom","Sawyer",2000.00));
        employeeList.add(new Employee(102L,"Luke","Skywalker",10000.00));
    }

    @Override
    public Employee findById(long id) {
        return null;
    }

    @Override
    public Employee findByLastName(String lastName) {
        return null;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeList;
    }

    @Override
    public void saveEmployee() {

    }

    @Override
    public void deleteEmployeeById(long id) {

    }


}
