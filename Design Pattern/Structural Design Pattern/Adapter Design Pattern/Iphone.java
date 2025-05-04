package AdapterDesignPattern;

public class Iphone {
    IphoneCharger charger;

    public Iphone(IphoneCharger charger) {
        this.charger = charger;
    }

    public void chargePhone(){
        charger.charge();
    }
}
