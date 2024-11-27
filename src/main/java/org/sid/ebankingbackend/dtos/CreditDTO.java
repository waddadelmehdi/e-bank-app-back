package org.sid.ebankingbackend.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreditDTO {
    private String accountId;
    private double amount;
    private String description;
}
