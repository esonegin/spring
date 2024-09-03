package ru.onegin.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author onegines
 * @date 01.09.2024
 */
@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.rockMusic = music1;
        this.classicalMusic = music2;
    }

    public String PlayMusic(Genre genre) {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        if (genre == Genre.CLASSICAL) {
            // случайная классическая песня
            return (String) classicalMusic.getSong().get(randomNumber);
        } else {
            // случайная рок песня
            return (String) rockMusic.getSong().get(randomNumber);
        }
    }
}
