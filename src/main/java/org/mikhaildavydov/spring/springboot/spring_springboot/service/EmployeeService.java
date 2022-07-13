package org.mikhaildavydov.spring.springboot.spring_springboot.service;



import org.mikhaildavydov.spring.springboot.spring_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmploy(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);
}
