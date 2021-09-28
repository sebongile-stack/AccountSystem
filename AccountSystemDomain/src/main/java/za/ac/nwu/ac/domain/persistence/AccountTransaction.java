package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACCOUNT_TYPE", schema = "AccountSystem")
public class AccountTransaction implements Serializable{

    private Long transactionId;
    @ManyToMany
    @JoinColumn(name = "account_type_account_type_id")
    private AccountType accountType;
    private Long memberId;
    private Long amount;
    private LocalDate transactionDate;

    public AccountTransaction(){

    }
    public AccountTransaction(Long transactionId, AccountType accountType, Long memberId, Long amount, LocalDate transactionDate){
        this.transactionId = transactionId;
        this.accountType = accountType;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }
    @Id
    @SequenceGenerator(name = "AccountSystem_SEQ", sequenceName = "AccountSystem.AccountSystem_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AccountSystem_SEQ")
    @Column(name = "TRANSACTION_ID")
    public long getTransactionId(){
        return transactionId;
    }
    @Column(name = "MEMBER_ID")
    public Long getMemberId(){
        return memberId;}

    @Column(name = "AMOUNT")
    public Long getAmount(){
        return amount;
    }

    @Column(name = "TRANSACTION_DATE")
    public LocalDate getTransactionDate(){
        return transactionDate;
    }

    public AccountType getAccountType(){
        return accountType;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }


    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setTransactionId(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transactionId, that.transactionId) && Objects.equals(accountType, that.accountType) && Objects.equals(memberId, that.memberId) && Objects.equals(amount, that.amount) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {return Objects.hash(transactionId, accountType, memberId, amount, transactionDate);}

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId='" + transactionId + '\'' +
                "accountType='" + accountType + '\'' +
                "memberId='" + memberId + '\'' +
                ", amount='" + amount + '\'' +
                ", transactionDate=" + transactionDate +
                '}';

    }

}
