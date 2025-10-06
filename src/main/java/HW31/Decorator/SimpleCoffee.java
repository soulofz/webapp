package HW31.Decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
