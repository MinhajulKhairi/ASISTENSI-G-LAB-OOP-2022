package com.week4.tugas2;

public class Song {
    private String tittle;
    private String artist;
    private String album;
    private int year;
    private String genre;

    public Song(String tittle, String artist, String album, int year, String genre) {
        this.tittle = tittle;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;

    }
    
    public Song() {
    }

    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    void displayInfo(){
    System.out.println("\njudul lagu :" + this.tittle + "\nnama artis :" + this.artist + "\nalbum :" + this.album + "\ntahun :" + this.year + "\ngenre :" + this.genre);
    }
}
