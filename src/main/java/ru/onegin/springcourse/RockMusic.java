package ru.onegin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
@Component
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> playlist = new ArrayList<>();
        {
            playlist.add("First Rock Song");
            playlist.add("Second Rock Song");
            playlist.add("Third Rock Song");
        }
        return playlist;
    }
}
