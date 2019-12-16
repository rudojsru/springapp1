package ua.sasza.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);

     // ClassicalMusic classicalMusic2 =new ClassicalMusic();


        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        musicPlayer.playMusic();
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        musicPlayer.playMusic();

        context.close();
    }

}
