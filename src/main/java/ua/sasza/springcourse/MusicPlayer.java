package ua.sasza.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 import java.util.Random;

 public class MusicPlayer {

@Qualifier("rockMusic")
private Music musicRock;
@Qualifier("classicalMusic")
private Music musicClassical;
@Qualifier("jazMusic")
private Music musicJaz;

@Value("${musicPlayer.name}")
private String name;
@Value("${musicPlayer.volume}")
private  int volume;

     public MusicPlayer(Music musicRock, Music musicClassical) {
         this.musicRock = musicRock;
         this.musicClassical = musicClassical;
     }

     public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(JanrOfMusic janrOfMusic) {
        Random random =new Random();
        int randoNumber =random.nextInt(3);
        if (janrOfMusic == JanrOfMusic.JAZ){

            System.out.println("Plaing is "+ new JazMusic().getSong().get(randoNumber));
          //  System.out.println("name = "+name);
          //  System.out.println("volume = "+volume );
        }
        if (janrOfMusic == JanrOfMusic.CLASSICAL){

            System.out.println("Plaing is "+ new ClassicalMusic().getSong().get(randoNumber));
        }
        if (janrOfMusic == JanrOfMusic.ROCK){

            System.out.println("Plaing is "+ new RockMusic().getSong().get(randoNumber));
        }
      }
}
