package com.example.diplom.services;

import com.example.diplom.entity.Role;
import com.example.diplom.entity.User;
import com.example.diplom.repositories.RoleRepository;
import com.example.diplom.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;


    public boolean createUser(User user) {
        String login = user.getLogin();
        if (userRepository.findByLogin(user.getLogin()) != null) return false;
        user.setId(UUID.randomUUID());
        user.setDate_create(new Date());
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        for (Role role : roleRepository.findAll()){
            if (role.getName().contains("Simple_User")){
                user.setRole_id(role);
            }
        }
        log.info ("Сохранение пользователя c почтой: " + login);
        userRepository.save(user);
        return true;
    }

}
