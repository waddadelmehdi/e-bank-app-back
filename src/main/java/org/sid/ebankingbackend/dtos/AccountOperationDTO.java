package org.sid.ebankingbackend.dtos;

import lombok.*;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.enums.OperationType;

import jakarta.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

