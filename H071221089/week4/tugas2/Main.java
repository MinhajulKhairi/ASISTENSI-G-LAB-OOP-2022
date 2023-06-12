package com.week4.tugas2;

public class Main {

    public static void main(String[] args) {
        Song song = new Song();
        song.setTittle("Bohemian Rhapsody");
        song.setArtist("Queen");
        song.setAlbum( "A Night at the Opera");
        song.setYear(1975);
        song.setGenre("Pop Rock");

        song.displayInfo();
        Song song1 = new Song("Say You Love Me","Jessie Ware","Tough Love",2014,"Pop");
        System.out.println(song1.getTittle());
        System.out.println(song1.getArtist());
        System.out.println(song1.getAlbum());
        System.out.println(song1.getYear());
        System.out.println(song1.getGenre());
        

        SelfUtils.displaySelfData();
    }
}
