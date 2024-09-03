package ru.onegin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
@Component("metalMusic")
public class MetallMusic implements Music{
    @Override
    public List<String> getSong() {
        List playlist = new ArrayList<>();
        playlist.add("First Metall Song");
        playlist.add("Second Metall Song");
        playlist.add("Third Metall Song");
        return playlist;
    }
}
