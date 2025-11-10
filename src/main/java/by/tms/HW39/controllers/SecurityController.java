package by.tms.HW39.controllers;

import by.tms.HW39.model.User;
import by.tms.HW39.service.SecurityService;
import by.tms.HW39.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/security")
public class SecurityController {
    public SecurityService securityService;
    public UserService userService;

    public SecurityController(SecurityService securityService, UserService userService) {
        this.securityService = securityService;
        this.userService = userService;
    }

    @PostMapping("/registration")
    public String registration(@RequestParam String username, @RequestParam String password, Model model) {
        boolean result = securityService.registration(username, password);
        if (result) {
            List<User> users = userService.getAllUsers();
            model.addAttribute("usersKey", users);
            return "users";
        }
        return "error";
    }
}
