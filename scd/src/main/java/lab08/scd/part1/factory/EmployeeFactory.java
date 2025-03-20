package lab08.scd.part1.factory;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        switch (type.toLowerCase()) {
            case "full time":
                return new FullTimeEmployee();
            case "part time":
                return new PartTimeEmployee();
            case "intern":
                return new Intern();
            default:
                throw new IllegalArgumentException("Invalid Employee Type");
        }
    }
}
