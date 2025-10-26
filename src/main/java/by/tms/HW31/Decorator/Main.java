package by.tms.HW31.Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " " + coffee.getPrice());
        coffee =  new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.getPrice());
        coffee = new SyrupDecorator(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.getPrice());
    }
}
