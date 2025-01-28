package com.itschool.session12.homework.ex2;

public class Student {

        String name;
        int studentId;
        double grade;


        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
            this.grade = 0;
        }


        public void setGrade(double grade) {
            this.grade = grade;
        }


        public double calculateAverage() {
            return grade;
        }


        public void display() {
            System.out.println("Student: " + name + " (ID: " + studentId + ")");
            System.out.println("Nota: " + grade);
            System.out.println("Media: " + calculateAverage());
        }
    }



