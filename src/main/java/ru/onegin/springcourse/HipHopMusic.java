package ru.onegin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
@Component("hiphopMusic")
public class HipHopMusic implements Music{
    @Override
    public List<String> getSong() {
        List playlist = new ArrayList<>();
        playlist.add("First Hiphop Song");
        playlist.add("Second Hiphop Song");
        playlist.add("Third Hiphop Song");
        return playlist;
    }
}
