package ru.onegin.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
public class MetallMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> playlist = new ArrayList<>();
        playlist.add("First Metall Song");
        playlist.add("Second Metall Song");
        playlist.add("Third Metall Song");
        return playlist;
    }
}
