package HW31.Decorator;

public class CoffeeDecorator implements Coffee{
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }
}
