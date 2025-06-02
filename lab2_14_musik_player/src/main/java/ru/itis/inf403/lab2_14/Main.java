package ru.itis.inf403.lab2_14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Playlist playlist = new Playlist();
        playlist.load();
        playlist.add(new Track( "Black eyes", "Chaikovskiy", ""));
        playlist.save();
    }
}
