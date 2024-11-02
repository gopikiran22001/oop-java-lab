package library.members;
public class Member {
    private String name,memberid,email,phone;

    public Member(){}

    public Member(String name, String memberid, String email, String phone) {
        this.name = name;
        this.memberid = memberid;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String toString() {
        return "Member[ Name:"+name+", MemberID:"+memberid+", Email:"+email+", Phone:"+phone+" ]";
    }
}