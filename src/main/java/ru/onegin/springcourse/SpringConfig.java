package ru.onegin.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author onegines
 * @date 03.09.2024
 */
@Configuration
/*@ComponentScan("ru.onegin.springcourse")*/
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public List<Music> genres() {
        List<Music> genres = new ArrayList<>();
        {
            genres.add(classicalMusic());
            genres.add(hipHopMusic());
            genres.add(metallMusic());
            genres.add(rockMusic());
            genres.add(technoMusic());
        }
        return genres;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genres());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public HipHopMusic hipHopMusic() {
        return new HipHopMusic();
    }

    @Bean
    public MetallMusic metallMusic() {
        return new MetallMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public TechnoMusic technoMusic() {
        return new TechnoMusic();
    }
}
