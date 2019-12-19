package ua.sasza.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

 public class MusicPlayer {

//@Qualifier("rockMusic")
//private Music musicRock;
//@Qualifier("classicalMusic")
//private Music musicClassical;
//@Qualifier("jazMusic")
//private Music musicJaz;
////@Qualifier("musicList")
private List<Music> musicList;

@Value("${musicPlayer.name}")
private String name;
@Value("${musicPlayer.volume}")
private  int volume;

     public MusicPlayer(List<Music> musicList) {
         this.musicList = musicList;
     }

     public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        Random random =new Random();
        int randomNuber=random.nextInt(3);
        Music music = musicList.get(randomNuber);

            System.out.println("Plaing is "+ music.getSong());

      }
}
