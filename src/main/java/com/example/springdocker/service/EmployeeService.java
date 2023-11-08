package com.example.springdocker.service;

import com.example.springdocker.module.Employee;
import com.example.springdocker.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public void save(Employee employee){
        System.out.println("employee = " + employee);
        employeeRepository.save(employee);
    }
    public Employee findById(Integer id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }
    public List<Employee> getAll(){
        List<Employee> all = employeeRepository.getAll();
        System.out.println("all = " + all);
        return all;
    }
}
