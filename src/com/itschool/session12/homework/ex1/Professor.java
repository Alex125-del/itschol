package com.itschool.session12.homework.ex1;

public class Professor {
    String firstName;
    String lastName;
    String sex;
    int age;
    String dateNasterei;
    long cnp;
    String address;

    @Override
    public String toString() {
        return "Profesor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateNasterei='" + dateNasterei + '\'' +
                ", cnp=" + cnp +
                ", address='" + address + '\'' +
                '}';
    }
}
