package by.tms.HW39.service;

import by.tms.HW39.model.User;
import by.tms.HW39.repository.UserRepository;
import org.springframework.stereotype.Service;


import java.sql.Timestamp;

@Service
public class SecurityService {
    private UserRepository userRepository;

    public SecurityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registration(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setCreated(new Timestamp(System.currentTimeMillis()));
        user.setUpdated(new Timestamp(System.currentTimeMillis()));

        try {
            return userRepository.insertUser(user, password) > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
