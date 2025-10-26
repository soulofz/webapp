package by.tms.HW29.S.good;

public class Home {
    private int flours;
    private int id;
    private String street;

    public Home(int id, String street, int flours) {
        this.id = id;
        this.street = street;
        this.flours = flours;
    }

    public int getFlours() {
        return flours;
    }

    public void setFlours(int flours) {
        this.flours = flours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Home{" +
                "flours=" + flours +
                ", id=" + id +
                ", street='" + street + '\'' +
                '}';
    }
}
