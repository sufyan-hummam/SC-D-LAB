package scd.lab7.service;

import scd.lab7.entities.Employee;
import scd.lab7.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(double salary) {
        return employeeRepository.findEmployeesWithSalaryGreaterThan(salary);
    }

    public void updateEmployeeSalary(int id, double salary) {
        employeeRepository.updateEmployeeSalary(id, salary);
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteEmployeeById(id);
    }

    public List<Employee> searchEmployeesByName(String name) {
        return employeeRepository.searchEmployeesByName(name);
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);

        if (existingEmployee.isPresent()) {
            Employee employee = existingEmployee.get();
            employee.setName(updatedEmployee.getName());
            employee.setSalary(updatedEmployee.getSalary());
            employee.setAddress(updatedEmployee.getAddress());
            employee.setDepartment(updatedEmployee.getDepartment());
            employee.setProjects(updatedEmployee.getProjects());

            return employeeRepository.save(employee);
        } else {
            throw new RuntimeException("Employee with ID " + id + " not found");
        }
    }
}
