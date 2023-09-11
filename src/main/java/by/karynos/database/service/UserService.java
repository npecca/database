package by.karynos.database.service;

import by.karynos.database.dto.UserDTO;
import org.apache.catalina.User;

import java.util.List;

public interface UserService
{
    List<UserDTO> findAllUsers();
}
