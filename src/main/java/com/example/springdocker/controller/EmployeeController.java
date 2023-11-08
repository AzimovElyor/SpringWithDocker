package com.example.springdocker.controller;

import com.example.springdocker.module.Employee;
import com.example.springdocker.service.EmployeeService;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Employee employee){
        System.out.println("employee = " + employee);
        employeeService.save(employee);
    }

    @GetMapping("/get-all")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee>  getAll(){
        return employeeService.getAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findById(Integer id){
        return employeeService.findById(id);
    }
}
