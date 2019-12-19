package ua.sasza.springcourse;

 import org.springframework.beans.factory.annotation.Qualifier;
 import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                                 SpringConfig.class
        );



//        MusicPlayer musicPlayer =context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic(JanrOfMusic.JAZ);

        MusicPlayer musicPlayer =context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        musicPlayer.playMusic();


      //  ClassicalMusic classicalMusic=context.getBean("classicalMusic",ClassicalMusic.class);
      //  ClassicalMusic classicalMusic2=context.getBean("classicalMusic",ClassicalMusic.class);
      //  System.out.println(classicalMusic==classicalMusic2);

         context.close();
    }

}
