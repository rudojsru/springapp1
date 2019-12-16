package ua.sasza.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music2 = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music2);

        musicPlayer.playMusic();

        Music music3 =context.getBean("clas",Music.class);

        MusicPlayer musicPlayer1= new MusicPlayer(music3);

        musicPlayer1.playMusic();

        context.close();
    }

}
