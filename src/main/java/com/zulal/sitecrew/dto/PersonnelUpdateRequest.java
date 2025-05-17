package com.zulal.sitecrew.dto;

public class PersonnelUpdateRequest {
    private String name;
    private String role;
    private String position;
    private String nationality;
    private String visaStatus;
    private Double salary;

    // Getters & Setters

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getVisaStatus() { return visaStatus; }
    public void setVisaStatus(String visaStatus) { this.visaStatus = visaStatus; }

    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }
}
