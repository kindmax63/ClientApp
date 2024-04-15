package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "surname")
    private String surname;
    @Column(name = "sex")
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "social_status")
    private String social_status;
    @Column(name = "salary")
    private int salary;
    @CreatedDate
    @Column(name = "created_at")
    private Date created_at;
    @CreatedDate
    @Column(name = "updated_at")
    private Date updated_at;
    @Column(name = "employment_status")
    private String employment_status;
    @Column(name = "job_position")
    private String job_position;
    @Column(name = "length_of_work")
    private String length_of_work;
    @Column(name = "company_address")
    private String company_address;
    @Column(name = "working_industry")
    private String working_industry;
    @Column(name = "city")
    private String city;
    @Column(name = "district")
    private String district;
    @Column(name = "street")
    private String street;
    @Column(name = "house")
    private String house;
    @Column(name = "appartment")
    private String appartment;
    @Column(name = "marriage_status")
    private String marriage_status;
    @OneToOne
    @JoinColumn(name = "document_type")
    private Offer document_type;
    @OneToOne
    @JoinColumn(name = "document_number")
    private Offer document_number;
    @Column(name = "number_of_children")
    private int number_of_children;
    @Column(name = "passport_series")
    private String passport_series;
    @Column(name = "passport_number")
    private String passport_number;
    @Column(name = "passport_who_issued")
    private String passport_who_issued;
    @Column(name = "passport_when_issued")
    private String passport_when_issued;
    @Column(name = "email_address")
    private String email_address;
    @Column(name = "mobile_number")
    private String mobile_number;
}
