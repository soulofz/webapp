package by.tms.HW30.AbstractFactory;

import by.tms.HW30.AbstractFactory.factory.MouseFactory;
import by.tms.HW30.AbstractFactory.factory.impl.GamingMouseFactory;
import by.tms.HW30.AbstractFactory.factory.impl.HomeMouseFactory;
import by.tms.HW30.AbstractFactory.factory.impl.OfficeMouseFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MouseFactory mouseFactory;
        System.out.println("Enter a mouse type you want to create:");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().trim().toLowerCase();

        switch (type) {
            case "gaming" -> mouseFactory = new GamingMouseFactory();
            case "office" -> mouseFactory = new OfficeMouseFactory();
            case "home" -> mouseFactory = new HomeMouseFactory();
            default -> mouseFactory = new OfficeMouseFactory();
        }
        System.out.println("We have a mouse with next options:");
        System.out.println(mouseFactory.createOptions().getButtons() + " Buttons");
        System.out.println(mouseFactory.createOptions().getDPI() + " DPI");

        System.out.println("It was created with this materials:");
        System.out.println("Material: " + mouseFactory.createMaterial().getMaterial());
        System.out.println("Color: " + mouseFactory.createMaterial().getColor());

        System.out.println("It has this engine:");
        System.out.println(mouseFactory.createEngine().getTypeOfConnection() + " type of connection");
        mouseFactory.createEngine().click();

    }
}
