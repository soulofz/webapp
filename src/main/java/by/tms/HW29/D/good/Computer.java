package by.tms.HW29.D.good;

public class Computer implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Computer is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is off");
    }
}
