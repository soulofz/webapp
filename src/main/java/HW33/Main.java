package HW33;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        DataBaseConnection dbc = new DataBaseConnection();
        dbc.getConnection();

        UserRepository ur = new UserRepository();

        User user = new User(0,"soulofz","qwerty22","Zhan","Efimenko", null, null);
        User user1 = new User(0,"soulofz1","qwerty22","Zhan","Efimenko", null, null);
        //ur.insertUser(user);
        //ur.insertUser(user1);
        //ur.insertUser(user1);

        //ur.updateUser(2,"Tobermory","zxcgod12","Alex", "Gilep");
        //ur.deleteUser(4);

        System.out.println(ur.getAllUsers());
    }
}
