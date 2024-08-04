package com.ensias.healthcareapp.model;

public class Doctor {
    private String name;
    private String address;
    private String tel;
    private String email;
    private String specialization;

    public Doctor(){
        //needed for firebase
    }

    public Doctor(String name, String address, String tel, String email, String specialization) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
