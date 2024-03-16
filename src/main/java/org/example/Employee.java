package org.example;

public class Employee {
     private String name;
     private String surname;
     private String position;
     private String seniority;


    public void personnel_full_name() {
        System.out.println("Adı: " + getName() + ", Soyadı: " + getSurname());
    }

    public void personnel_other_infos() {
        System.out.println("Pozisyonu: " + getPosition() + ", Kıdem: " + getSeniority());
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
