/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numcompseriosa;

/**
 *
 * @author Jericho Seriosa
 */
import java.util.Scanner;

public class NumCompSeriosa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}

