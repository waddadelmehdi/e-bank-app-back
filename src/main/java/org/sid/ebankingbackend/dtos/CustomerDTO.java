package org.sid.ebankingbackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.sid.ebankingbackend.entities.BankAccount;

import jakarta.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
