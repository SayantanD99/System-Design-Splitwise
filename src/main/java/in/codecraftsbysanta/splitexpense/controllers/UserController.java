package in.codecraftsbysanta.splitexpense.controllers;

import in.codecraftsbysanta.splitexpense.dtos.CreateUserRequest;
import in.codecraftsbysanta.splitexpense.models.User;
import in.codecraftsbysanta.splitexpense.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;
    public User createUser(CreateUserRequest request) {
        return userService.createUser(request.toUser());
    }
}