/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.greeting;

/**
 *
 * @author COMLAB101
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        PriorityQueue<String> cnames = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the nicknames of four of your classmates:");
        for (int i = 0; i < 4; i++) {
            String cname = scanner.nextLine();
            cnames.add(cname);
        }

        while (!cnames.isEmpty()) {
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Press H to say Hi to a classmate:");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("H")) {
                    String nickname = cnames.poll();
                    System.out.println("Hi " + nickname + "!");
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please press H to say Hi.");
                }
            }
        }

        System.out.println("Done saying hi!");
    }
}

