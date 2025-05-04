package AbstractFactoryDesignPattern;

public class BackendDeveloper implements Employee{
    @Override
    public int employeeSalary() {
        return 1200000;
    }

    @Override
    public String employeeRole() {
        return "BACKEND";
    }
}
