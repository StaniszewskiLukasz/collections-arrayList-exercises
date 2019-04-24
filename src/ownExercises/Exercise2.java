package ownExercises;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to insert an element into the array list at the first position
public class Exercise2 {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add(0, "Black");
        colorsList.add("White");
        System.out.println(colorsList);
    }
}
