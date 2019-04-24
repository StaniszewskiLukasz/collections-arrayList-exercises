package ownExercises;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to update specific array element by given element
public class Exercise4 {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add("Red");
        colorsList.add("Black");
        System.out.println(colorsList);
        colorsList.set(1,"Czerwony");
        System.out.println(colorsList);
    }
}
