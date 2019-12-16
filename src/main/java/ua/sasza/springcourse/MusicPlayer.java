package ua.sasza.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {


    private List<Music> musics =new ArrayList();
    private String name;
    private int volume;


    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
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

    //IOC

    public MusicPlayer() {
    }

    public MusicPlayer(List musics) {
        this.musics = musics;
    }

    public void  setMusic(){
        this.musics=musics;
    }

    public void playMusic(){
        for (Music m:musics) {
            System.out.println("Playing: "+m);

        }
    }

}
