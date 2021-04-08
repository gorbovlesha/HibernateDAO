import company.Employee;
import services.EmployeeService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Employee emp = new Employee("Egor", "Kazakov", "Sales", 900);
        employeeService.addEmployee(emp);
        System.out.println("Done successfully");
        List<Employee> emps = employeeService.getAllEmployees();
        for (Employee employee : emps) {
            System.out.println(employee.toString());
        }

    }
}
