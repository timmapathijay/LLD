package AbstractFactoryDesignPattern;

public class BackendDeveloperFactory extends EmployeeAbstractFactory{
    @Override
   Employee createEmployee() {
        return new BackendDeveloper();
    }
}
