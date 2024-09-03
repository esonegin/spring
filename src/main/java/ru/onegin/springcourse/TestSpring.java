package ru.onegin.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * @author onegines
 * @date 30.08.2024
 */
public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.PlayMusic());
        context.close();
    }
}
