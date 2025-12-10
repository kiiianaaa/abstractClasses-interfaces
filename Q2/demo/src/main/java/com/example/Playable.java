package com.example;

public interface Playable {
    void play();
    void stop();
}

class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing audio file....");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped.");
    }
}

class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Rendering video pixels....");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped.");
    }
}
