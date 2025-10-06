package HW31.Decorator;

public class SyrupDecorator extends CoffeeDecorator{

    public SyrupDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
       return super.getDescription() + " ,with syrup";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }

}
