package ru.gegcuk.webapp1;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> music;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private int volume;

    public void setMusic(ArrayList music) {
        this.music = music;
    }

    public MusicPlayer(ArrayList music){
        this.music = music;
    }

    public MusicPlayer(){}


    public void playAllMusic() {
        for (Music song : music){
            System.out.println(song.getSong());
        }
    }
}
