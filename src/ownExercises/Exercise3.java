package ownExercises;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class Exercise3 {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add("Red");
        colorsList.add("Black");
        System.out.println(colorsList.get(1));
    }
}
