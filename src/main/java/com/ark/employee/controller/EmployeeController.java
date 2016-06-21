package com.ark.employee.controller;

import com.ark.employee.model.Employee;
import com.ark.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Arun on 6/20/16.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/employees", method = RequestMethod.GET)
    public ResponseEntity<List<Employee>> listAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        if(employees.isEmpty()){
            return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);

    }
}
