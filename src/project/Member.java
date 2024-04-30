package project;

import java.util.ArrayList;

public class Member {
    private int memberId;
    private String fullName;
    private String email;
    private boolean isActive;

    public Member(String record){
        String[] values = record.split(",");
        this.memberId = Integer.parseInt(values[0]);
        this.fullName = values[1];
        this.email = values[2];
        this.isActive = Boolean.parseBoolean(values[3]);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

