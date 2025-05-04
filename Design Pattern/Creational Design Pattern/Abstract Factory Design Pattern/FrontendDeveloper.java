package AbstractFactoryDesignPattern;

public class FrontendDeveloper implements Employee{
    @Override
    public int employeeSalary() {
        return 700000;
    }

    @Override
    public String employeeRole() {
        return "FRONTEND";
    }
}
