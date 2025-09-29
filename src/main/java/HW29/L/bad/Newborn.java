package HW29.L.bad;

public class Newborn extends Person{
    @Override
    public void run(){
        throw new UnsupportedOperationException("Newborn can't run");
    }
}
