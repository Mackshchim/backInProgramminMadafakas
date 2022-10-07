package tatar.mackshchim.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    Music current;

    public MusicPlayer(@Autowired Music music) {
        current = music;
    }

    public void play() {
        System.out.println("Playing:");
        System.out.println(current.toString());
    }



}
