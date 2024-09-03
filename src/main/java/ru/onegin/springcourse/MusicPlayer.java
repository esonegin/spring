package ru.onegin.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

/**
 * @author onegines
 * @date 01.09.2024
 */
@Component
public class MusicPlayer {
    private List<Music> genres;

    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }

    public String PlayMusic() {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomGenre = random.nextInt(genres.size() - 1);
        int randomSongNumber = random.nextInt(3);
        return genres.get(randomGenre).getSong().get(randomSongNumber);

        /*if (genre == Genre.CLASSICAL) {
            // случайная классическая песня
            return (String) classicalMusic.getSong().get(randomNumber);
        } else {
            // случайная рок песня
            return (String) rockMusic.getSong().get(randomNumber);
        }*/
    }
}
