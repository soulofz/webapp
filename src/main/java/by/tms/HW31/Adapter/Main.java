package by.tms.HW31.Adapter;

public class Main {
    public static void main(String[] args) {
        MicroUSBPhone oldPhone = new MicroUSBPhone();
        TypeCCharger charger = new TypeCAdapter(oldPhone);
        charger.chargeWithTypeC();
    }
}
