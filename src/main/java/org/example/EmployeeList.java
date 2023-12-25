package org.example;

public class EmployeeList
{
    public static void main(String[] args) {
// Employee sınıfından iki nesne oluşturuluyor
        Employee personnel1 = new Employee();
        Employee personnel2 = new Employee();
// 1. çalışanın bilgileri veriliyor
        personnel1.name = "Aysu";
        personnel1.surname = "Murat";
        personnel1.position = "QA Engineer";
        personnel1.seniority = "1";

// 2. çalışanın bilgileri veriliyor
        personnel2.name = "Büşra";
        personnel2.surname = "Murat";
        personnel2.position = "QA Lead";
        personnel2.seniority = "3";

        personnel1.personnel_full_name();
        personnel1.personnel_other_infos();
        personnel2.personnel_full_name();
        personnel2.personnel_other_infos();
    }
}
