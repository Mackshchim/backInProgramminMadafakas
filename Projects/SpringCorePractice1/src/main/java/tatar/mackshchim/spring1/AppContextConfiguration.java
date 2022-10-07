package tatar.mackshchim.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
public class AppContextConfiguration {

    @Bean
    @Scope("singleton")
    public List<String> list() {
        List list = new ArrayList<>();
        list.add("Locked Club");
        list.add("Any Act");
        return list;
    }

    @Bean
    @Scope("prototype") //for some reason
    public Music music() {
        Music mus = new Music(list(),"Sadism");
        return mus;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContextConfiguration.class);
        MusicPlayer mp3 = context.getBean(MusicPlayer.class);
        mp3.play();

    }
}
