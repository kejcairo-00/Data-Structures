/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.birthmonth;

/**
 *
 * @author COMLAB101
 */
import java.util.*;
import java.util.Scanner;
import java.util.HashSet;

public class BirthMonth {
    public static void main(String[] args) {
        int birth1 = 0, birth2 = 0;
        HashSet grp1 = new HashSet();
        HashSet grp2 = new HashSet(); 
        HashSet self = new HashSet(); 
        
        Scanner scnr = new Scanner(System.in);
        
        for(int a = 0; a <= 6; a++){
            if(a > 0 && a <= 3){
                birth1++;
                System.out.print("Enter birth month "+birth1+": ");
                String month1 = scnr.next(); 
                grp1.add(month1);
            }else if(a > 3 && a <= 6){
                birth2++;
                System.out.print("Enter birth month "+birth2+": "); 
                String month2 = scnr.next();
                grp2.add(month2);
            }
        }
        HashSet union = new HashSet(grp1); 
        HashSet inter = new HashSet(grp1); 
        HashSet diff = new HashSet(grp1);
        
        union.addAll(grp2); 
        union.retainAll(grp2);
        diff.removeAll(grp2);
        
        System.out.println("Group 1: "+ grp1); 
        System.out.println("Group 2: "+ grp2);
        
        System.out.print("Enter your birth month: ");
        String mine = scnr.next();
        self.add(mine);
        
        System.out.println("Union: "+ union); 
        System.out.println("Intersection: "+ inter); 
        System.out.println("Difference: "+ diff);
        
        if(grp1.containsAll(self)|| grp2.containsAll(self)){
            System.out.println("You have the same birth month with atleast one of your classmates.");
        }else{
            System.out.println("You don't have the same birth month with one of your classmates."); 
        }
   
    }
}
