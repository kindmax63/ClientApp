package com.example.diplom.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "roles_permissions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @OneToOne
    @JoinColumn(name = "permission_id")
    private Permission permission_id;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role_id;
}
