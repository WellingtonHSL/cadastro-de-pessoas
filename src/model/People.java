package model;

public class People {
    private String name;
    private String CPF;
    private int phoneNumber;
    private String address;
    private String email;

    public People (
            String name,
            String CPF,
            int phoneNumber,
            String address,
            String email
    ) {
        this.name = name;
        this.CPF = CPF;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public People () {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}