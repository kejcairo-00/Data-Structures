/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.movietime;

/**
 *
 * @author COMLAB101
 */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MovieTime {
    public static void main(String[] args) {
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Input movies
        System.out.println("Please enter three(3) movies you'd like to watch:");
        for (int i = 0; i < 3; i++) {
            String movie = scanner.nextLine();
            movies.offer(movie);
        }

        // Input snacks
        System.out.println("Please enter three (3) snacks or beverages you'd like to have while watching these movies:");
        for (int i = 0; i < 3; i++) {
            String snack = scanner.nextLine();
            snacks.offer(snack);
        }

        // Display movies
        System.out.println("Movies to watch are: ");
        while (!movies.isEmpty()) {
            System.out.println(movies.remove());
        }

        // Display snacks
        System.out.println("Snacks available: ");
        for (String snack : snacks) {
            System.out.println(snack);
        }

        // Prompt for 'S' input
        System.out.println("\nPress 'S' whenever you are done eating or drinking a snack.");
        while (!snacks.isEmpty()) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("S")) {
                snacks.remove();
                if (snacks.isEmpty()) {
                    System.out.println("No more snacks are left.");
                } else {
                    System.out.println("Remaining Snacks: " + snacks);
                }
            }
        }
    }
}