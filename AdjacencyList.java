/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adjacencylist;

/**
 *
 * @author Jericho Seriosa
 */
import java.util.ArrayList;

public class AdjacencyList {
    public static void main (String [] args){
        ArrayList <ArrayList> adjacencyList = new ArrayList<>();
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int num = 7; // number of vertices

        for (int i = 0; i < num; i++){
            adjacencyList.add(new ArrayList<>());
        }
    
        adjacencyList.get(0).add('B');
        adjacencyList.get(1).add('A');
        adjacencyList.get(1).add('C');
        adjacencyList.get(2).add('B');
        adjacencyList.get(2).add('D');
        adjacencyList.get(2).add('E');
        adjacencyList.get(3).add('C');
        adjacencyList.get(3).add('E');
        adjacencyList.get(3).add('F');
        adjacencyList.get(3).add('G');
        adjacencyList.get(4).add('C');
        adjacencyList.get(4).add('D');
        adjacencyList.get(4).add('F');
        adjacencyList.get(5).add('D');
        adjacencyList.get(5).add('E');
        adjacencyList.get(6).add('D');
    
        int disp = 0; // displaying letters A to G
    
        for (int i = 0; i < num; i++, disp++){
            System.out.println(vertices[disp] + ": " + adjacencyList.get(i));
        }
    }
}

