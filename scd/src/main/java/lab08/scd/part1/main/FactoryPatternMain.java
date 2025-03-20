package lab08.scd.part1.main;

import lab08.scd.part1.factory.Employee;
import lab08.scd.part1.factory.EmployeeFactory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        Employee emp1 = EmployeeFactory.getEmployee("fulltime");
        emp1.showEmployeeType();

        Employee emp2 = EmployeeFactory.getEmployee("intern");
        emp2.showEmployeeType();
    }
}