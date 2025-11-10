package by.tms.HW39and40.controllers;

import by.tms.HW39and40.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;
}
