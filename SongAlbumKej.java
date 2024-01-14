/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.songalbumkej;

/**
 *
 * @author Jericho Seriosa
 */
import java.util.LinkedList;

public class SongAlbumKej {
    LinkedList<String> songs = new LinkedList<>();
    LinkedList<String> artists = new LinkedList<>();
    LinkedList<String> album = new LinkedList<>();
    int currentIndex = 0;

    public static void main(String[] args) {
        SongAlbumKej sak = new SongAlbumKej();

        sak.songs.add("Paraan");
        sak.songs.add("Bakit Part 2");
        sak.songs.add("Synesthesia");
        sak.songs.add("Bumalik kana sakin");
        sak.songs.add("Kung Di Rin Ikaw");
        sak.songs.add("Patiwakal");


        sak.artists.add("Mayonnaise");
        sak.artists.add("Mayonnaise");
        sak.artists.add("Silent Sanctuary");
        sak.artists.add("Mayonnaise");
        sak.artists.add("Mayonnaise");
        sak.artists.add("Jrldm");

        sak.processNext();
    }

    public void processNext() {
        if (currentIndex >= songs.size()) {
            printOutput();
            return;
        }

        String combination = songs.get(currentIndex) + " - " + artists.get(currentIndex);
        album.add(combination);

        currentIndex++;
        processNext();
    }

    public void printOutput() {
        System.out.printf("%-20s%-20s%-20s\n", "Songs", "Artists", "Album");
        for (int i = 0; i < songs.size(); i++) {
            System.out.printf("%-20s%-20s%-20s\n", songs.get(i), artists.get(i), album.get(i));
        }
    }
}

