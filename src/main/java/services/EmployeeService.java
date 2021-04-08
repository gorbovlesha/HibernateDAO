package services;

import DAO.EmployeeDAOImpl;
import company.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

    public void addEmployee(Employee employee) {
        employeeDAO.add(employee);
    }
    public void updateEmployee(Employee employee) {
        employeeDAO.update(employee);
    }
    public void deleteEmployee(Employee employee) {
        employeeDAO.delete(employee);
    }
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }
    public Employee getEmployeeById(int id) {
        return employeeDAO.findById(id);
    }
}
