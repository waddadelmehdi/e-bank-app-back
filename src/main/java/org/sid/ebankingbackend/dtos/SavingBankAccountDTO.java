package org.sid.ebankingbackend.dtos;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.sid.ebankingbackend.enums.AccountStatus;
import java.util.Date;
@Getter
@Setter
@ToString
public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
