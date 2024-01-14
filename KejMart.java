/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kejmart;

/**
 *
 * @author Jericho Seriosa
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KejMart {

    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hello Ma'am/Sir, Welcome to Kej Mart");
        Thread.sleep(1000);
        
        System.out.println("Can I ask you, what is your name? ");
        String name = sc.nextLine();
        Thread.sleep(1000);
        
        System.out.println("Nice to meet you, " + name);
        System.out.println("Are you going to go grocery today? ");
        Thread.sleep(2000);
        String ask = sc.nextLine();
        
        if (ask.equalsIgnoreCase("Yes")){
            System.out.println("That's good to hear! Common let's buy some stuff you want.");
        } else if (ask.equalsIgnoreCase("No")){
             System.out.println("Let's roam around, and see if you can find something");
        } else{
            System.out.println("Ok! Have a wonderful day!");
            Thread.sleep(1000);
        }
       
        System.out.println("What kind of stuff you need? " );
        String fStuff = sc.nextLine();
        
        ArrayList stuff = new ArrayList();
        Collections.addAll(stuff, "Hygiene", "Food", "Make ups", "Drinks", "Toys", "School Supplies", "Utensils");
        Collections.shuffle(stuff);
        Thread.sleep(1000);
        System.out.println(fStuff + " is over there! Common, please follow the arrow!");
    }
}

