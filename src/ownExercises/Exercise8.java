package ownExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Write a Java program to sort a given array list
public class Exercise8 {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add("Red");
        colorsList.add("Black");
        System.out.println(colorsList);
        Collections.sort(colorsList);
        System.out.println(colorsList);
    }
}
