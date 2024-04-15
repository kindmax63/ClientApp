package com.example.diplom.repositories;

import com.example.diplom.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RolePermissionRepository extends JpaRepository <RolePermission, UUID> {
}
