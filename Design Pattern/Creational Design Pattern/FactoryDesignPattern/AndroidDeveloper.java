package FactoryDesignPattern;

public class AndroidDeveloper implements  Employee{

    @Override
    public int getSalary() {
        return 1000000;
    }

    @Override
    public String getEmployeeType() {
        return "ANDROID DEVELOPER";
    }
}
