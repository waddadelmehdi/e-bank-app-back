package org.sid.ebankingbackend.entities;

import lombok.*;
import org.sid.ebankingbackend.enums.OperationType;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;
    private String description;
}

