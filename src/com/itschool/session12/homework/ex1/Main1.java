package com.itschool.session12.homework.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.firstName = "Syla";
        student1.lastName = "Jon";
        student1.age = 19;
        student1.sex = "M";
        student1.cnp = 778912586;
        student1.dataNasterei = "25.01.1991";
        student1.address = "Route du Bavois 5 ";

        Professor matchProfessor = new Professor();
        matchProfessor.firstName = "Boush";
        matchProfessor.lastName = "Michel";
        matchProfessor.age = 58;
        matchProfessor.sex = "M";
        matchProfessor.cnp = 25893634;
        matchProfessor.dateNasterei = "10.01.1968";
        matchProfessor.address = "Avenue du Colomb 8";

        Curs math = new Curs();
        math.name = "Math";
        math.professor = matchProfessor;
        math.students = new ArrayList<>();
        math.students.add(student1);
        math.duration = "2 Hours";
        math.description = "Match level 2 ";
        math.schedule = "MONDAY AND WEDNESDAY FROM 10 AM TO 12 PM !";


        Student student2 = new Student();
        student2.firstName = "Clarc";
        student2.lastName = "Ana";
        student2.age = 20;
        student2.sex = "F";
        student2.cnp = 78963264;
        student2.dataNasterei = "5.03.2000";
        student2.address = "Route du Bovin 5";
        math.students.add(student2);

        Professor biologyProfessor = new Professor();
        biologyProfessor.firstName = "Egger";
        biologyProfessor.lastName = "Emil";
        biologyProfessor.age = 55;
        biologyProfessor.sex = "M";
        biologyProfessor.cnp = 726686323;
        biologyProfessor.dateNasterei = "21.03.1970";
        biologyProfessor.address = "5 Avenue";

        Curs biology = new Curs();
        biology.name = "Biology";
        biology.professor = biologyProfessor;
        biology.students = new ArrayList<>();
        biology.students.add(student2);
        biology.schedule = "Tuesday and Thursday from 10 AM to 12 PM !";
        biology.description = "Internal biology !";
        biology.duration = "3 Hours";

        List<Curs> cursuri = new ArrayList<>();
        cursuri.add(math);
        cursuri.add(biology);
        System.out.println(cursuri);

        for (Curs curs : cursuri) {
            System.out.println("Curs: " + curs.name);
            System.out.println("Profesor: " + curs.professor.firstName + " " + curs.professor.lastName);
            System.out.println("Students:");
            for (Student student : curs.students) {
                System.out.println("  " + student.firstName + " " + student.lastName + ", Age: " + student.age + ", Sex: " + student.sex + ", CNP: " + student.cnp + ", Address: " + student.address);
            }
            System.out.println();
        }
    }

}
