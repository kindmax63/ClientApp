package com.example.diplom.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "offers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "type")
    private String type;
    @OneToOne
    @JoinColumn(name = "application_id")
    private Application application_id;
    @Column(name = "name_file_offer")
    private String name_file_offer;
    @Column(name = "key")
    private String key;
}
