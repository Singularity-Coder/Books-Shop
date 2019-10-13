package com.singularitycoder.brhatmrdanga.auth;

public class Users {
    // Make sure u use the same names as u provided in the Firebase. Same obj names
    private String zone, memberType, folkId, adminNumber, firstName, lastName, phone, email, password;

    public Users() {
    }

    public Users(String zone, String memberType, String folkId, String adminNumber, String firstName, String lastName, String phone, String email, String password) {
        this.zone = zone;
        this.memberType = memberType;
        this.folkId = folkId;
        this.adminNumber = adminNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public String getZone() {
        return zone;
    }

    public String getMemberType() {
        return memberType;
    }

    public String getFolkId() {
        return folkId;
    }

    public String getAdminNumber() {
        return adminNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
