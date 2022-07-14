package org.mikhaildavydov.spring.springboot.spring_springboot.dao;



import org.mikhaildavydov.spring.springboot.spring_springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
