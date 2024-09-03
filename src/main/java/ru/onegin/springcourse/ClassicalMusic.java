package ru.onegin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
@Component
public class ClassicalMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> playlist = new ArrayList<>();
        {
            playlist.add("First Classical Song");
            playlist.add("Second Classical Song");
            playlist.add("Third Classical Song");
        }
        return playlist;
    }
}
