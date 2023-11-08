package com.example.springdocker.repository;

import com.example.springdocker.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select e from Employee e")
     List<Employee> getAll();
}
