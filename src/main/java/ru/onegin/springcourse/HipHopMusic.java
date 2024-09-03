package ru.onegin.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
public class HipHopMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String>  playlist = new ArrayList<>();
        playlist.add("First Hiphop Song");
        playlist.add("Second Hiphop Song");
        playlist.add("Third Hiphop Song");
        return playlist;
    }
}
