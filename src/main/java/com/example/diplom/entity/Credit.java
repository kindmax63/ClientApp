package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "credits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client_id;
    @OneToOne
    @JoinColumn(name = "application_id")
    private Application application_id;
    @OneToOne
    @JoinColumn(name = "offer_id")
    private Offer offer_id;
    @OneToOne
    @JoinColumn(name = "tariff_id")
    private Tariff tariff_id;
    @Column(name = "state")
    private String state;
    @Column(name = "dpd")
    private int dpd;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "period")
    private int period;
    @Column(name = "total_debt")
    private BigDecimal total_debt;
    @Column(name = "repayment_date")
    private Date repayment_date;
    @Column(name = "created_at")
    private Date created_at;
    @Column(name = "updated_at")
    private Date updated_at;
    @Column(name = "closed_at")
    private Date closed_at;
}
