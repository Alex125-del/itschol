package com.itschool.session19.hammework.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
     ArrayList<String> colors = new ArrayList<>();
     colors.add("Green");
     colors.add("Blue");
     colors.add("Black");
     colors.add("Red");
     colors.add("Yellow");
        System.out.println("Colors" + colors);

    // iterate through all elements in a array list.

        for (String color : colors){
            System.out.println(color);
        }
    // insert an element into the array list at the first position.
        colors.add(0,"Red");
        System.out.println("After inserting at first positions" + colors);


        //to retrieve an element (at a specified index) from a given array list.

        colors.get(4);
        System.out.println("Element at index 4 : " + colors.get(4));

        // to update specific array element by given element.
        colors.set(2,"Purple");
        System.out.println("After updating :" + colors);

        //to remove the third element from a array list.
        colors.remove(2);
        System.out.println("After removing :" + colors);

        //to search an element in a array list.
        String searchColor = "Blue";
        System.out.println("List contains :" + searchColor + ":" + colors.contains(searchColor));

        //program to sort a given array list.
        Collections.sort(colors);
        System.out.println("Sorted list: " + colors);


    }

}

