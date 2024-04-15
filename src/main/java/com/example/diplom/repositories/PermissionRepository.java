package com.example.diplom.repositories;

import com.example.diplom.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PermissionRepository extends JpaRepository <Permission, UUID> {
}
