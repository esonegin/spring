package ru.onegin.springcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 01.09.2024
 */
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;


    //IoC
   /* public MusicPlayer(Music music) {
        this.music = music;
    }*/

    public void playMusic(){
        //System.out.println("Playing: " + musicList.getSong());
        for(Music music : musicList){
            System.out.println(music.getSong());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

}
