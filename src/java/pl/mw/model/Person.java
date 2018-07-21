package pl.mw.model;

public class Person {
    String name;
    String surName;
    int bornYear;
    int phone;
    String sex;


    public Person(String name, String surName, int bornYear, int phone, String sex) {
        this.name = name;
        this.surName = surName;
        this.bornYear = bornYear;
        this.phone = phone;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", bornYear=" + bornYear +
                ", phone=" + phone +
                ", sex='" + sex + '\'' +
                '}';
    }
}
