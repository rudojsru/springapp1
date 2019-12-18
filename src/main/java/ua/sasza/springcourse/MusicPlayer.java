package ua.sasza.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.Media;
import java.util.Random;

@Component
public class MusicPlayer {

@Autowired
@Qualifier("rockMusic")
private Music musicRock;
@Autowired
@Qualifier("classicalMusic")
private Music musicClassical;
@Autowired
@Qualifier("jazMusic")
private Music musicJaz;





    public void playMusic(JanrOfMusic janrOfMusic) {
        Random random =new Random();
        int randoNumber =random.nextInt(3);
        if (janrOfMusic == JanrOfMusic.JAZ){

            System.out.println("Plaing is "+ new JazMusic().getSong().get(randoNumber));
        }
        if (janrOfMusic == JanrOfMusic.CLASSICAL){

            System.out.println("Plaing is "+ new ClassicalMusic().getSong().get(randoNumber));
        }
        if (janrOfMusic == JanrOfMusic.ROCK){

            System.out.println("Plaing is "+ new RockMusic().getSong().get(randoNumber));
        }
      }
}
