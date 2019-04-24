package ownExercises;

import java.util.ArrayList;
import java.util.List;
//Write a Java program to remove the third element from a array list
public class Exercise5 {
    public static void main(String[] args) {
        List<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add("Red");
        colorsList.add("Black");
        System.out.println(colorsList);
        colorsList.remove(2);
        System.out.println(colorsList);
    }
}
