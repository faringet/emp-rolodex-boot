package org.mikhaildavydov.spring.springboot.spring_springboot.dao;



import org.mikhaildavydov.spring.springboot.spring_springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
