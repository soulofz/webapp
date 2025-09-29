package HW29.D.good;

public class Main {
    public static void main(String[] args) {
        Switcher lightSwitch = new Switcher(new LightBulb());
        lightSwitch.press(); //лампочка включилась
        lightSwitch.press(); //лампочка выключилась

        Switcher compSwitcher = new Switcher(new Computer());
        compSwitcher.press(); //комп работает
        compSwitcher.press(); //компа не работает
    }
}
