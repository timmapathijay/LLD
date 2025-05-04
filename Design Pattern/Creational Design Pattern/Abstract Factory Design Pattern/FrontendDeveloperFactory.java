package AbstractFactoryDesignPattern;

public class FrontendDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    Employee createEmployee() {
        return new FrontendDeveloper();
    }
}
