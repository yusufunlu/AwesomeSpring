package com.yusufu.awesomespring.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Table(name = "customer")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Customer extends DateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
}