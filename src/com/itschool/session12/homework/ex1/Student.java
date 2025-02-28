package com.itschool.session12.homework.ex1;

public class Student {

    String firstName;
    String lastName;
    String sex;
    int age;
    String dataNasterei;
    long cnp;
    String address;
    @Override
    public String toString() {
        return "StudentClass{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dataNasterei='" + dataNasterei + '\'' +
                ", cnp='" + cnp + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
