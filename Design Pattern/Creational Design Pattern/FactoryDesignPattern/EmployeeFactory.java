package FactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String empRole){
        if(empRole.trim().equalsIgnoreCase("ANDROID")){
            return new AndroidDeveloper();
        }
        else if(empRole.trim().equalsIgnoreCase("WEB")){
            return  new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
