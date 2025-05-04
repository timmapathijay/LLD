package AdapterDesignPattern;

public class AdapterDesignPattern {
    public static void main(String [] args){
        IphoneCharger iphoneCharger = new DXYIphoneCharger();
        AndroidPhoneCharger androidPhoneCharger = new DESCOAndroidCharger();
        Iphone iphone_13 = new Iphone(iphoneCharger);
        iphone_13.chargePhone();

        Iphone iphone_10 = new Iphone(new Adapter(androidPhoneCharger));
        iphone_10.chargePhone();

    }
}
