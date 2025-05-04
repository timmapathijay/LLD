package AdapterDesignPattern;

public class DESCOAndroidCharger implements AndroidPhoneCharger{
    @Override
    public void charge() {
        System.out.println("Android phone charging.....");
    }
}
