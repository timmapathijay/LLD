package FactoryDesignPattern;

public class FactoryDesignPatter {
    public static void main(String[] args){
        Employee employee = EmployeeFactory.getEmployee("ANDROID");
        System.out.println(employee.getEmployeeType() + " : " + employee.getSalary());
        Employee employee1 = EmployeeFactory.getEmployee("WEB");
        System.out.println(employee1.getEmployeeType() + " : " + employee1.getSalary());
    }
}
