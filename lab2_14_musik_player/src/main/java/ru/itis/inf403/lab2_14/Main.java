package ru.itis.inf403.lab2_14;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.load();
        playlist.add(new Track(1, "Black eyes", "Chaikovskiy", ""));
        playlist.save();
    }
}
