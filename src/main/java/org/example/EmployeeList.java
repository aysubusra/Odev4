package org.example;

public class EmployeeList
{
    public static void main(String[] args) {

// Employee sınıfından iki nesne oluşturuluyor
        Employee personnel1 = new Employee();
        Employee personnel2 = new Employee();

// 1. çalışanın bilgileri veriliyor
        personnel1.setName("Aysu");
        personnel1.setSurname("Murat");
        personnel1.setPosition("QA Engineer");
        personnel1.setSeniority("1");

// 2. çalışanın bilgileri veriliyor
        personnel2.setName("Büşra");
        personnel2.setSurname("Murat");
        personnel2.setPosition("QA Lead");
        personnel2.setSeniority("3");

        personnel1.personnel_full_name();
        personnel1.personnel_other_infos();
        personnel2.personnel_full_name();
        personnel2.personnel_other_infos();
    }
}



