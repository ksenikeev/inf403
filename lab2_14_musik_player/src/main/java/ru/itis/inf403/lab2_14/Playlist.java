package ru.itis.inf403.lab2_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private List<Track> playlist;

    public Playlist() {}

    public void save() {
        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("Playlist.pst"))){

            oos.writeObject(playlist);
            oos.flush();

        } catch(IOException e) {
            throw new RuntimeException();
        }
    }

    public void load() {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("Playlist.pst"))) {

            playlist = (List<Track>) ois.readObject();

        } catch (FileNotFoundException e) {
            playlist = new ArrayList<>();
        } catch(Exception e) {
            throw new RuntimeException();
        }
    }

    public void add(Track track) {
        playlist.add(track);
    }

}
