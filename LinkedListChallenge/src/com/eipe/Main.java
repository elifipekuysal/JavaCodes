package com.eipe;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean goingForward = true;

    public static void main(String[] args) {
        Song song1 = new Song("Figure It Out", 4);
        Song song2 = new Song("Come With Me", 3);
        Song song3 = new Song("Oh No", 3);
        Song song4 = new Song("The Way You Used To Do", 5);
        Song song5 = new Song("Highway To Hell", 4);

        Album album1 = new Album();
        album1.addNewSong(song1);
        album1.addNewSong(song2);
        albums.add(album1);

        Album album2 = new Album();
        album2.addNewSong(song3);
        album2.addNewSong(song4);
        albums.add(album2);

        LinkedList<Song> playlist = new LinkedList<>();
        addSongToPlaylist(playlist, song1);
        addSongToPlaylist(playlist, song2);
        addSongToPlaylist(playlist, song3);
        addSongToPlaylist(playlist, song4);
        addSongToPlaylist(playlist, song5);
        addSongToPlaylist(playlist, song1);

        boolean quit = false;

        System.out.print("Enter your choice: ");
        int action = scanner.nextInt();
        scanner.nextLine();

        while(!quit) {
            switch(action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    nextSong(playlist);
                    break;
                case 2:
                    previousSong(playlist);
                    break;
                case 3:
                    replay(playlist);
                    break;
                case 4:
                    listPlaylist(playlist);
                    break;
                case 5:
                    printOptions();
                    break;

            }
        }

    }

    private static boolean addSongToPlaylist (LinkedList<Song> playlist, Song newSong) {
        String songTitle = newSong.getTitle();
        int songDuration = newSong.getDuration();

        boolean alreadyAdded = false;
        boolean addedToAlbum = false;

        for(int i = 0; i < albums.size(); i++) {
            Album album = albums.get(i);
            Iterator<Song> albumIterator = album.albumSongs.iterator();
            while(albumIterator.hasNext()) {
                if(albumIterator.next() == newSong) {
                    addedToAlbum = true;
                    break;
                }
            }
        }

        if(!addedToAlbum) {
            System.out.println("This song is not a member of an album, it cannot be added to the playlist.");
            return false;
        }

        Iterator<Song> songIterator = playlist.iterator();
        while(songIterator.hasNext()) {
            if(songIterator.next().getTitle() == songTitle) {
                alreadyAdded = true;
                break;
            }
        }

        if(alreadyAdded == true) {
            System.out.println("This song is already added to the playlist.");
            return false;
        }

        if(songDuration <= 0) {
            System.out.println("Duration should be more than 0.");
            return false;
        }

        playlist.add(newSong);

        System.out.println("Song " + songTitle + " ("+ songDuration + ") is added to the playlist.");
        return true;
    }

    private static void nextSong(LinkedList<Song> playlist) {
        Iterator<Song> songIterator = playlist.iterator();

        if(!goingForward) {
            if(songIterator.hasNext()) {
                songIterator.next();
            }
            goingForward = true;
        }

        if(songIterator.hasNext()) {
            System.out.println("Song " + songIterator.next() + " is playing.");
        } else {
            System.out.println("Reached the last song.");
        }
    }

    private static void previousSong(LinkedList<Song> playlist) {
        ListIterator<Song> songIterator = playlist.listIterator();

        if(goingForward) {
            if(songIterator.hasPrevious()) {
                songIterator.previous();
            }
            goingForward = false;
        }

        if(songIterator.hasPrevious()) {
            System.out.println("Song " + songIterator.previous() + " is playing.");
        } else {
            System.out.println("It is the first song, can't skip previous.");
        }
    }

    private static void replay(LinkedList<Song> playlist) {
        ListIterator<Song> songIterator = playlist.listIterator();
        System.out.println("Song " + songIterator.previous() + " is playing again.");
    }

    private static void listPlaylist(LinkedList<Song> playlist) {
        Iterator<Song> songIterator = playlist.iterator();
        System.out.println("Songs in the playlist:");

        for(int i = 0; songIterator.hasNext(); i++) {
            System.out.println((i+1) + ". " + songIterator.next().getTitle() + " (" + songIterator.next().getDuration() + ")");
        }
    }

    private static void printOptions() {
        System.out.println("Available actions: ");
        System.out.println("0 - to quit\n" +
                "1 - to skip forward the next song\n" +
                "2 - to skip backwards to a previous song\n" +
                "3 - to replay the current song\n" +
                "4 - to list the songs in playlist\n" +
                "5 - to list options");
    }
}
