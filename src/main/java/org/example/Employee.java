package org.example;

public class Employee {
     public String name;
     public String surname;
     public String position;
     public String seniority;


    public void personnel_full_name() {
        System.out.println("Adı: " + name + ", Soyadı: " + surname);
    }

    public void personnel_other_infos() {
        System.out.println("Pozisyonu: " + position + ", Kıdem: " + seniority);
    }





}
