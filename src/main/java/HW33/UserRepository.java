package HW33;


import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final String INSERT_USER = "INSERT INTO users(id,username,password,first_name,last_name,created,updated) VALUES(DEFAULT,?,?,?,?,?,?)";
    private static final String UPDATE_USER = "UPDATE users SET username = ? ,password = ?,first_name = ?,last_name = ?,updated = CURRENT_TIMESTAMP WHERE id = ?";
    private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";
    private static final String SELECT_ALL = "SELECT * FROM users";

    public void insertUser(User user) {
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void updateUser(int id, String newUsername, String newPassword, String newFirstName, String newLastName) {
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)) {
            preparedStatement.setInt(5, id);
            preparedStatement.setString(1, newUsername);
            preparedStatement.setString(2, newPassword);
            preparedStatement.setString(3, newFirstName);
            preparedStatement.setString(4, newLastName);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void deleteUser(int id) {
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException | IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (Connection connection = DataBaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String firstName = resultSet.getString("first_name");
                String lastname = resultSet.getString("last_name");
                LocalDateTime created = resultSet.getTimestamp("created").toLocalDateTime();
                LocalDateTime updated = resultSet.getTimestamp("updated").toLocalDateTime();
                users.add(new User(id, username, password, firstName, lastname, created, updated));
            }
        } catch (SQLException | ClassNotFoundException | IOException exception) {
            throw new RuntimeException(exception);
        }
        return users;
    }
}
