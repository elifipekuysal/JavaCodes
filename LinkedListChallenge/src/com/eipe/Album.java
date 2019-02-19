package com.eipe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Album {

    LinkedList<Song> albumSongs = new LinkedList<>();

    public boolean addNewSong(Song newSong) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a title for the song: ");
        String songTitle = scanner.nextLine();    */

        String songTitle = newSong.getTitle();
        int songDuration = newSong.getDuration();

        boolean alreadyAdded = false;

        Iterator<Song> songIterator = this.albumSongs.iterator();
        while(songIterator.hasNext()) {
            if(songIterator.next().getTitle() == songTitle) {
                alreadyAdded = true;
                break;
            }
        }

        if(alreadyAdded == true) {
            System.out.println("This song is already added to the album.");
            return false;
        }
/*        System.out.print("Enter duration for the song: ");
        int songDuration = scanner.nextInt();
        scanner.nextLine();    */

        if(songDuration <= 0) {
            System.out.println("Duration should be more than 0.");
            return false;
        }

        this.albumSongs.add(newSong);

        System.out.println("Song " + songTitle + " ("+ songDuration + ") is added to the album.");
        return true;
    }
}
