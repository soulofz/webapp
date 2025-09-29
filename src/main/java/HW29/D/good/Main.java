package HW29.D.good;

public class Main {
    public static void main(String[] args) {
        Switcher lightSwitcher = new Switcher(new LightBulb());
        lightSwitcher.press(); //лампочка включилась
        lightSwitcher.press(); //лампочка выключилась

        Switcher compSwitcher = new Switcher(new Computer());
        compSwitcher.press(); //комп работает
        compSwitcher.press(); //компа не работает
    }
}
