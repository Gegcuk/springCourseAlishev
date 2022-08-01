package ru.gegcuk.webapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music rockMusic = context.getBean("rockMusic",Music.class);
        Music jazzMusic = context.getBean("jazzMusic",Music.class);

        MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
        MusicPlayer jazzMusicPlayer = new MusicPlayer(jazzMusic);
        rockMusicPlayer.playMusic();
        jazzMusicPlayer.playMusic();

        context.close();
    }
}
