package by.karynos.database.service.impl;

import by.karynos.database.dto.UserDTO;
import by.karynos.database.entity.UserEntity;
import by.karynos.database.repository.UserRepository;
import by.karynos.database.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService
{
    private final UserRepository userRepository;
    @Override
    public List<UserDTO> findAllUsers()
    {
        List<UserEntity> userEntityList = userRepository.findAll();

        List<UserDTO> userDTOList = userEntityList.stream().map(x -> {
            return UserDTO.builder().id(x.getId()).name(x.getName()).build();
        }).toList();
        return userDTOList;
    }
}
