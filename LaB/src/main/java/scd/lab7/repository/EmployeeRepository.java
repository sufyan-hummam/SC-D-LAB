package scd.lab7.repository;

import scd.lab7.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e WHERE e.salary > :salary")
    List<Employee> findEmployeesWithSalaryGreaterThan(double salary);

    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.salary = :salary WHERE e.id = :id")
    void updateEmployeeSalary(int id, double salary);

    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.id = :id")
    void deleteEmployeeById(int id);

    @Query("SELECT e FROM Employee e WHERE LOWER(e.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Employee> searchEmployeesByName(String name);
}
