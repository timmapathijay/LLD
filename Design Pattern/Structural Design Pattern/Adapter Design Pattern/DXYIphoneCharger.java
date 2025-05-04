package AdapterDesignPattern;

public class DXYIphoneCharger implements IphoneCharger{

    @Override
    public void charge() {
        System.out.println("Iphone is charging.....");
    }
}
