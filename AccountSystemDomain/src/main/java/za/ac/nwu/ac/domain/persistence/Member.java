package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "MEMBER", schema = "SEBONGILE")
public class Member implements Serializable {

    private Long memberId;
    private String memberLName;
    private String memberFName;
    private Long numPlays;

    public Member(){

    }
    public Member(Long memberId, String memberLName, String memberFName, Long numPlays){
        this.memberId = memberId;
        this.memberLName = memberLName;
        this.memberFName = memberFName;
        this.numPlays = numPlays;

    }
    public Member(String memberLName, String memberFName, Long numPlays){
        this.memberLName = memberLName;
        this.memberFName = memberFName;
        this.numPlays = numPlays;

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

    @Column(name = "MEMBERLNAME")
    public String getMemberLName() {
        return memberLName;
    }

    public void setMemberLName(String memberLName) {
        this.memberLName = memberLName;
    }

    @Column(name = "MEMBERFNAME")
    public String getMemberFName() {
        return memberFName;
    }

    public void setMemberFName(String memberFName) {
        this.memberFName = memberFName;
    }

    @Column(name = "NUMPLAYS")
    public Long getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(Long numPlays) {
        this.numPlays = numPlays;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(memberLName, that.memberLName) && Objects.equals(memberFName, that.memberFName) && Objects.equals(numPlays, that.numPlays);
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
