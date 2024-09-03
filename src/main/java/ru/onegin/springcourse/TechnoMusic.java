package ru.onegin.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
@Component("technoMusic")
public class TechnoMusic implements Music{

    @Override
    public List<String> getSong() {
        List playlist = new ArrayList<>();
        playlist.add("First Techno Song");
        playlist.add("Second Techno Song");
        playlist.add("Third Techno Song");
        return playlist;
    }
}
