package HW31.Adapter;

public class TypeCAdapter implements TypeCCharger{
    private final MicroUSBPhone microUSBPhone;

    public TypeCAdapter(MicroUSBPhone microUSBPhone) {
        this.microUSBPhone = microUSBPhone;
    }

    @Override
    public void chargeWithTypeC(){
        System.out.println("Adapter from TypeC to MicroUSB connected.");
        microUSBPhone.chargeWithMicroUSB();
    }
}
