package FactoryDesignPattern;

public class WebDeveloper implements  Employee{
    @Override
    public int getSalary() {
        return 700000;
    }

    @Override
    public String getEmployeeType() {
        return "WEB DEVELOPER";
    }
}
