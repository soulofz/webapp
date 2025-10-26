package by.tms.HW29.S.bad;

public class Home {
    private int flours;
    private int id;
    private String street;

    public Home(int id, String street, int flours) {
        this.id = id;
        this.street = street;
        this.flours = flours;
    }
     public void getInfo(){
        System.out.println("ID: " + id + " Flours: " + flours + " Street: " + street);
     }

     public void printAndSaveOnServer(){
        //print
         // save
     }
}
