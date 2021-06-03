package by.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
//@ComponentScan("by.test")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic(){
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        List<Music> musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(classicMusic());
        musicList.add(popMusic());
        return new MusicPlayer(musicList);
    }


    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
