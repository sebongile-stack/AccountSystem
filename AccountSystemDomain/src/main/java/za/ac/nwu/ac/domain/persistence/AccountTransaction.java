package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "ACCOUNT_TRANSACTION", schema = "SEBONGILE")
public class AccountTransaction implements Serializable{

    private static final long serialVersionUID = -7785421760893770535L;

    private Long transactionId;
    @ManyToMany
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
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
    @SequenceGenerator(name = "SEBONGILE_SEQ", sequenceName = "SEBONGILE.SEBONGILE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEBONGILE_SEQ")
    @Column(name = "TRANSACTION_ID")
    public Long getTransactionId(){
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

    public void setTransactionDate(LocalDate transactionDate) {
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
