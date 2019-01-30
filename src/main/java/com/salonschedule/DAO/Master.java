package com.salonschedule.DAO;

public class Master {

   private int masrersid;
   private String surname;
   private String name;
   private String patronymic;
   private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getMasrersid() {
        return masrersid;
    }

    public void setMasrersid(int masrersid) {
        this.masrersid = masrersid;
    }
    public static String getTestText() {
        return "testString";
    }
}
