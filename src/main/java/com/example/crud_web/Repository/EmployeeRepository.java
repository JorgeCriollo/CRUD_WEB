package com.example.crud_web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.crud_web.Model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}