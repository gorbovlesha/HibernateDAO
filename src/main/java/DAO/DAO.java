package DAO;

import company.Employee;

import java.util.List;

public interface DAO {
    void add(Employee employee);
    void update(Employee employee);
    void delete(Employee employee);
    List<Employee> findAll();
    Employee findById(int id);
}
