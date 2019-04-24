package ownExercises;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to search an element in a array list
public class Exercise7 {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add("Red");
        colorsList.add("Black");
        System.out.println(colorsList.contains("Black"));
        System.out.println(colorsList.contains("black"));
    }
}
