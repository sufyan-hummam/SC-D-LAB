package lab08.scd.part2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lab08.scd.part2.model.Employee;
import lab08.scd.part2.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/clone/{id}")
    public Employee cloneEmployee(@PathVariable Long id) {
        return service.cloneEmployee(id);
    }
}
