package com.example.diplom.repositories;

import com.example.diplom.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.text.SimpleDateFormat;
import java.util.UUID;


public interface ClientRepository extends JpaRepository <Client, UUID> {

}
