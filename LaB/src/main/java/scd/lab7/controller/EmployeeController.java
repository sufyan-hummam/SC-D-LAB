package scd.lab7.controller;

import scd.lab7.entities.Employee;
import scd.lab7.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/salaryGreaterThan/{amount}")
    public List<Employee> getEmployeesWithSalaryGreaterThan(@PathVariable double amount) {
        return employeeService.getEmployeesWithSalaryGreaterThan(amount);
    }

    @PutMapping("/{id}/updateSalary")
    public String updateEmployeeSalary(@PathVariable int id, @RequestParam double salary) {
        employeeService.updateEmployeeSalary(id, salary);
        return "Salary updated successfully for employee ID: " + id;
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(id, updatedEmployee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully with ID: " + id;
    }

    @GetMapping("/search")
    public List<Employee> searchEmployeesByName(@RequestParam String name) {
        return employeeService.searchEmployeesByName(name);
    }
}
