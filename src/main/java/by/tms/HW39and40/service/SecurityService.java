package by.tms.HW39and40.service;

import by.tms.HW39and40.model.User;
import by.tms.HW39and40.model.UserRegistrationDto;
import by.tms.HW39and40.repository.UserRepository;
import org.springframework.stereotype.Service;


import java.sql.Timestamp;

@Service
public class SecurityService {
    private UserRepository userRepository;

    public SecurityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registration(UserRegistrationDto userRegistrationDto) {
        User user = new User();
        user.setUsername(userRegistrationDto.getUsername());
        user.setPassword(userRegistrationDto.getPassword());
        user.setCreated(new Timestamp(System.currentTimeMillis()));
        user.setUpdated(new Timestamp(System.currentTimeMillis()));

        try {
            return userRepository.insertUser(user, userRegistrationDto.getPassword()) > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
