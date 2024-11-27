package org.sid.ebankingbackend.entities;

import lombok.*;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CA")
@Getter
@Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class CurrentAccount extends BankAccount {
    private double overDraft;
}
