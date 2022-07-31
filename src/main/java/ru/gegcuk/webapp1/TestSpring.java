package ru.gegcuk.webapp1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean",Music.class);

        new MusicPlayer(music).playMusic();

        context.close();
    }
}
