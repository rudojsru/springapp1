package ua.sasza.springcourse;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")

public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic (){
        return new ClassicalMusic();
    }

    @Bean
    public  RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public  JazMusic jazMusic(){
        return new JazMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(new RockMusic(),new JazMusic(), new ClassicalMusic());
    }


}
