package HW30.Prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porsche",2025,"Gray");
        Car cloanedCar = (Car) car.clone();
        System.out.println(cloanedCar.getMark());
        System.out.println(cloanedCar.getYearOfProduction());
        System.out.println(car.getColor());
    }
}
