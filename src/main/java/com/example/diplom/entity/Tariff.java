package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tariffs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tariff{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "name")
    private String tariff_name;
    @Column(name = "tariff_sum")
    private int tariff_sum;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
    @Column(name = "min_amount")
    private BigDecimal min_amount;
    @Column(name = "max_amount")
    private BigDecimal max_amount;
    @Column(name = "max_period")
    private int max_period;
    @Column(name = "min_period")
    private int min_period;
    @Column(name = "penalty")
    private BigDecimal penalty;
    @Column(name = "percent")
    private BigDecimal percent;
    @Column(name = "fee")
    private BigDecimal fee;

}
