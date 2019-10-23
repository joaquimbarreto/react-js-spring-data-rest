package com.example.reactjsspringdatarest.repository;

import com.example.reactjsspringdatarest.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}