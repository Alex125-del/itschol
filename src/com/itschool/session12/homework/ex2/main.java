package com.itschool.session12.homework.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Student> students = new ArrayList<>();


        System.out.print("Câți studenți vrei să adaugi? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nIntroducerea detaliilor pentru studentul " + (i + 1));

            System.out.print("Numele studentului: ");
            String name = scanner.nextLine();

            System.out.print("ID-ul studentului: ");
            int studentId = scanner.nextInt();
            scanner.nextLine();


            Student student = new Student(name, studentId);
            students.add(student);


            System.out.print("Introdu nota studentului: ");
            double grade = scanner.nextDouble();
            student.setGrade(grade);
            scanner.nextLine();
        }


        System.out.println("\nInformațiile despre toți studenții:");
        for (Student student : students) {
            student.display();
            System.out.println("------------------------");
        }

        scanner.close();
    }
}

