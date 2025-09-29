package HW29.I.bad;

public class Phone implements Devicable{
    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sendMessage() {
        //логика отправки смс
    }

    @Override
    public void makePhoto() {
        //логика фотграфирования
    }
}
