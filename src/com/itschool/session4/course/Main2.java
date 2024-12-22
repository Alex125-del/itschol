package com.itschool.session4.course;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please insert number:");
        int number = scanner.nextInt();

        System.out.println("Please insert cifra" );
        int cifra = scanner.nextInt();

        boolean isNumbersHigher = number >= cifra;
        System.out.println("Is number hiher than cifra" + isNumbersHigher );


    }







}
