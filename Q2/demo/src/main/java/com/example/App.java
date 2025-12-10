package com.example;
import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {

        ArrayList<Playable> players = new ArrayList<>();

        players.add(new MusicPlayer());
        players.add(new VideoPlayer());

        for (Playable p : players) {
            p.play();
        }
    }
}

