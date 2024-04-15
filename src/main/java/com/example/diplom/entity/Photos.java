package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
/**kindmax63**/
@Entity
@Table(name = "photos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client_id;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "application_id")
    private Application application_id;
    @Column(name = "status")
    private String status;
    @Column(name = "name_file_photo")
    private String name_file_photo;
    @Column(name = "key")
    private String key;
    @Column(name = "comment")
    private String comment;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
    @Column(name = "reason")
    private String reason;
    @PrePersist
    private void init() {
        created_at = new Date();
        status = "WAITING_CHECK";
    }

}