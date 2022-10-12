package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //Mit Hilfe der Annotation value können wir den Wert aus der Aussendatei einfügen
   // мы ожидаем, что спринг внедрит в наш MusicPlayer бин ClassicalMusic
// Spring soll den Bean einfügen, das das Interface Music realisiert
    private Music music;

@Autowired
// In dem Konstruktor erwarten wir ClassicalMusic
    public  MusicPlayer(Music music){
    this.music = music;
}

public void playMusic() {
    System.out.println("Playing: " + music.getSong());
}

// Hier haben wir nur ein Bean mit der Klasse ClassicalMusic
}
