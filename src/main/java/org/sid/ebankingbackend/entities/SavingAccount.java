package org.sid.ebankingbackend.entities;

import lombok.*;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("SA")
@Getter
@Setter
@ToString @NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount {
    private double interestRate;
}
