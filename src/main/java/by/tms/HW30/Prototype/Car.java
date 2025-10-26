package by.tms.HW30.Prototype;

public class Car implements Prototype {
    private String mark;
    private int yearOfProduction;
    private String color;

    public Car(String mark, int yearOfProduction, String color) {
        this.mark = mark;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Prototype clone(){
        return new Car(mark, yearOfProduction, color);
    }
}
