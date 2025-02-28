package com.itschool.session12.homework.ex1;

import java.util.List;

public class Curs {

    String name;
    String schedule;
    int duration;
    String description;
    Professor professor;
    List<Student> students;

    @Override
    public String toString() {
        return "Curs{" +
                "name='" + name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", profesor=" + professor +
                ", students=" + students +
                '}';
    }
}
