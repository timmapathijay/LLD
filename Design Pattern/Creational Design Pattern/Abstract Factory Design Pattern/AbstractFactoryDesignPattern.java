package AbstractFactoryDesignPattern;

public class AbstractFactoryDesignPattern {
    public static void main(String[] args){
        Employee employee_1 = EmployeeFactory.getEmployee(new BackendDeveloperFactory());
        System.out.println(employee_1.employeeRole());

        Employee employee_2 = EmployeeFactory.getEmployee(new FrontendDeveloperFactory());
        System.out.println(employee_2.employeeRole());
    }
}
/*
Abstract Design Pattern
- Creational Design Pattern
- It is similar to Factory Design Pattern. It provides the concept of factory of factories.
 */
