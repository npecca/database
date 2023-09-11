package by.karynos.database.controller;

import by.karynos.database.dto.UserDTO;
import by.karynos.database.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController
{
    private final UserService userService;
    @GetMapping
    public List<UserDTO> getAllUsers(){
        return userService.findAllUsers();
    }

}
