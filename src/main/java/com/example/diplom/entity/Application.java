package com.example.diplom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "applications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;
    @Column(name = "state")
    private String state;
    @Column(name = "requested_amount")
    private BigDecimal requested_amount;
    @Column(name = "requested_period")
    private int requested_period;
    @Column(name = "approved_amount")
    private BigDecimal approved_amount;
    @Column(name = "approved_period")
    private int approved_period;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "period")
    private int period;
    @OneToOne (cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private BankAccount account_id;
    @OneToOne (cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "offer_id")
    private Offer offer_id;
    @CreatedDate
    @Column(name = "created_at")
    private Date created_at;
    @CreatedDate
    @Column(name = "updated_at")
    private Date updated_at;
    @OneToOne (cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private Employee employee_id;
    @OneToOne (cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "tariff_id")
    private Tariff tariff_id;
    @Column(name = "reject_reason")
    private String reject_reason;
    @Column(name = "approved_at")
    private Date approved_at;
    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;
}
