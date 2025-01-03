package model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private String id;
    private int age;
    private int PhoneNumber;
    private String email;
    private String address;

    public Customer(String name, String id, int age, int phoneNumber, String email, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        PhoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
