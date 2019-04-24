package ownExercises;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a new array list, add some colors (string) and print out the collection
public class Exercise1 {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add("Red");
        colorsList.add("Black");
        System.out.println(colorsList);
    }
}
