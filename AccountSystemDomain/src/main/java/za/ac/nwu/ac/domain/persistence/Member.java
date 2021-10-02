package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Member implements Serializable {

    private Long memberId;
    private String memberLName;
    private String memberFName;
    private Long numPlays;
    private Long miles;
    private Long amount;
    private LocalDate creatioNDate;

    public Member(){

    }
    public Member(Long memberId, String memberLName, String memberFName, Long numPlays, Long miles, Long amount, LocalDate creatioNDate){
        this.memberId = memberId;
        this.memberLName = memberLName;
        this.memberFName = memberFName;
        this.numPlays = numPlays;
        this.miles = miles;
        this.amount = amount;
        this.creatioNDate = creatioNDate;

    }
    public Member(String memberLName, String memberFName, Long numPlays, Long miles, Long amount, LocalDate creatioNDate){
        this.memberLName = memberLName;
        this.memberFName = memberFName;
        this.numPlays = numPlays;
        this.miles = miles;
        this.amount = amount;
        this.creatioNDate = creatioNDate;
    }

    @Id
    @SequenceGenerator(name = "SEBONGILE_SEQ", sequenceName = "SEBONGILE.SEBONGILE_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEBONGILE_SEQ")
    @Column(name = "MEMBER_ID")

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberLName() {
        return memberLName;
    }

    public void setMemberLName(String memberLName) {
        this.memberLName = memberLName;
    }

    public String getMemberFName() {
        return memberFName;
    }

    public void setMemberFName(String memberFName) {
        this.memberFName = memberFName;
    }

    public Long getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(Long numPlays) {
        this.numPlays = numPlays;
    }

    public Long getMiles() {
        return miles;
    }

    public void setMiles(Long miles) {
        this.miles = miles;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public LocalDate getCreatioNDate() {
        return creatioNDate;
    }

    public void setCreatioNDate(LocalDate date) {
        this.creatioNDate = creatioNDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(memberLName, that.memberLName) && Objects.equals(memberFName, that.memberFName) && Objects.equals(numPlays, that.numPlays) && Objects.equals(miles, that.miles) && Objects.equals(amount, that.amount) && Objects.equals(creatioNDate, that.creatioNDate);
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
