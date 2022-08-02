package ru.gegcuk.webapp1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCongig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());

        context.close();

    }
}
