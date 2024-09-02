package ru.onegin.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author onegines
 * @date 30.08.2024
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        firstMusicPlayer.setVolume(80);
        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
