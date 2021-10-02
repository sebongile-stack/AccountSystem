package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "SEBONGILE")
public class AccountType implements Serializable{

    private static final long serialVersionUID = 6546653819204621164L;
    public String memberLName;
    public String memberFName;
    public Long numPlays;
    public Long miles;
    public Long amount;
    public LocalDate creatioNDate;

    private Long accountTypeId;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    private Set<AccountTransaction> accountTransaction;


    public AccountType(){

    }
    public AccountType(Long accountTypeId, String mnemonic, String accountTypeName, LocalDate creationDate){
        this.accountTypeId = accountTypeId;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountType(String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    @Id
    @SequenceGenerator(name = "SEBONGILE_SEQ", sequenceName = "SEBONGILE.SEBONGILE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEBONGILE_SEQ")
    @Column(name = "ACCOUNT_TYPE_ID")
    public Long getAccountTypeId(){
        return accountTypeId;
    }

    @Column(name = "ACCOUNT_TYPE_NAME")
    public String getAccountTypeName(){
        return accountTypeName;
    }

    @Column(name = "CREATION_DATE")
    public LocalDate getCreationDate(){
        return creationDate;
    }

    @Column(name = "MNEMONIC")
    public String getMnemonic(){
        return mnemonic;}

    @OneToMany(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY, mappedBy = "accountType")
    public Set<AccountTransaction> getAccountTransaction(){
        return accountTransaction;

    }
    public void setAccountTransaction(Set<AccountTransaction> accountTransaction){
        this.accountTransaction = accountTransaction;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {return Objects.hash(accountTypeId, mnemonic, accountTypeName, creationDate);}

    @Override
    public String toString() {
        return "AccountType{" +
                "accountTypeId='" + accountTypeId + '\'' +
                "mnemonic='" + mnemonic + '\'' +
                ", accountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';

    }

}
