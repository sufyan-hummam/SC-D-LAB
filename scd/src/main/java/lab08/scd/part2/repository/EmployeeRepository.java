package lab08.scd.part2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import lab08.scd.part2.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
