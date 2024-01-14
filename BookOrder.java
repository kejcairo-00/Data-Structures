/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookorder;

/**
 *
 * @author Jericho Seriosa
 */
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class BookOrder {
    public static void main(String[] args) {
        Queue<String> bookQueue = new LinkedList<>();
        Stack<String> titleStack = new Stack<>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter four book titles.");
        int numOfBooks = 4;
        for(int i = 1; i <= numOfBooks; i++){
            System.out.print("Book " + i + ": ");
            String title = userInput.nextLine();
            titleStack.push(title);
        }
        for(int i = 1; i <= numOfBooks; i++){
            bookQueue.offer(titleStack.pop());
        }
        System.out.println("New order of books:");
        System.out.println(bookQueue);
    }
}