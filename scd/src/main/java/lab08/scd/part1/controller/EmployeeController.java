package lab08.scd.part1.controller;

import org.springframework.web.bind.annotation.*;
import lab08.scd.part1.factory.Employee;
import lab08.scd.part1.factory.EmployeeFactory;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping("/{type}")
    public String getEmployee(@PathVariable String type) {
        try {
            Employee employee = EmployeeFactory.getEmployee(type);
            return employee.getClass().getSimpleName() + " created successfully!";
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }
}
