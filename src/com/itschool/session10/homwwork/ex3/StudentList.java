package com.itschool.session10.homwwork.ex3;

import java.util.ArrayList;

public class StudentList {

    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduatesStudenList = new ArrayList<>();

        studentList.add("Alina");
        studentList.add("Ana");
        studentList.add("Alexandru");
        studentList.add("David");
        studentList.add("Eva");
        studentList.add("Constantin");
        studentList.add("Maria");
        studentList.add("Sofia");
        studentList.add("Yac");
        studentList.add("Ionut");

        graduatesStudenList.addAll(studentList);
        System.out.println("Graduated Students:");
        for (String student : graduatesStudenList) {
            System.out.println(student);
        }

    }


}
