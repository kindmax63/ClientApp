package com.example.diplom.repositories;

import com.example.diplom.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ApplicationRepository extends JpaRepository <Application, UUID> {

}
