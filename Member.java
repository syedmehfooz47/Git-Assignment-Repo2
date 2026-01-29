public class Member {
    private int memberId;
    private String name;
    private String email;
    private String phone;
    private String membershipType;

    public Member(int memberId, String name, String email, String phone, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.membershipType = membershipType;
    }

    // Getters and Setters
    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) { this.memberId = memberId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    public String getMembershipType() { return membershipType; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }

    @Override
    public String toString() {
        return "Member [ID=" + memberId + ", Name=" + name + ", Type=" + membershipType + "]";
    }
}
