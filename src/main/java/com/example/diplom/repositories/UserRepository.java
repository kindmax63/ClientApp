package com.example.diplom.repositories;

import com.example.diplom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {
    User findByLogin (String login);
}
