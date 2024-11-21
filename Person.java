package com.example.labassignment2;

public class Person {
    private String name;
    private String fatherName;
    private String cnic;
    private String dateOfBirth;
    private String gender;
    private String city;

    // Constructor
    public Person(String name, String fatherName, String cnic, String dateOfBirth, String gender, String city) {
        this.name = name;
        this.fatherName = fatherName;
        this.cnic = cnic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.city = city;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name + " | " + fatherName + " | " + cnic + " | " + dateOfBirth + " | " + gender + " | " + city;
    }
}

