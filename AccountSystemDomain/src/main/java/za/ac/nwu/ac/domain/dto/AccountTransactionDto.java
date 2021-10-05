package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "AccountTransaction", description = "A DTO that represents the AccountTransaction")

public class AccountTransactionDto implements Serializable{
    private AccountType accountType;
    private Long memberId;
    private Long amount;
    private LocalDate transactionDate;

    public AccountTransactionDto(){

    }
    public AccountTransactionDto(AccountType accountType, Long memberId, Long amount, LocalDate transactionDate){
        this.accountType = accountType;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;

    }
    public AccountTransactionDto(AccountTransaction accountTransaction){
        this.setAccountType(accountTransaction.getAccountType());
        this.setMemberId(accountTransaction.getMemberId());
        this.setAmount(accountTransaction.getAmount());
        this.setTransactionDate(accountTransaction.getTransactionDate());
    }
    @ApiModelProperty(position = 1,
            value = "AccountTransaction accountType",
            name  = "accountType",
            notes = "Uniquely identifies the account type",
            dataType = "java.lang.String",
            example = "MILES",
            required = true
    )
    public AccountType accountType(){
        return accountType;
    }
    public void setAccountType(AccountType accountType){
        this.accountType = accountType;
    }

    @ApiModelProperty(position = 2,
            value = "AccountTransaction memberID",
            name  = "Name",
            notes = "The name of the AccountType",
            dataType = "java.long.String",
            example = "Miles",
            required = true
    )

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @ApiModelProperty(position = 3,
            value = "AccountTransaction amount",
            name  = "amount",
            notes = "The name of the AccountType",
            dataType = "java.long.String",
            example = "Miles",
            required = true
    )

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @ApiModelProperty(position = 4,
            value = "AccountTransaction transactionDate",
            name  = "transactionDate",
            notes = "The name of the AccountType",
            dataType = "java.long.String",
            example = "Miles",
            required = true
    )

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
