package AdapterDesignPattern;

public class Adapter implements IphoneCharger{
    private AndroidPhoneCharger androidPhoneCharger;
    public Adapter(AndroidPhoneCharger androidPhoneCharger) {
        this.androidPhoneCharger = androidPhoneCharger;
    }
    @Override
    public void charge() {
        androidPhoneCharger.charge();
        System.out.println("Phone is charging using adapter......");
    }
}
