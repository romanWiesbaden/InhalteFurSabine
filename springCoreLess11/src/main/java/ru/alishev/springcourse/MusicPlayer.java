package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {
    //Mit Hilfe der Annotation value können wir den Wert aus der Aussendatei einfügen
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    private Music music1;
    private Music music2;
    // Ioc
    // Wir übergeben in die Klasse die Dependency

@Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
        @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


  public String playMusic(){
      return "Playing: " + music1.getSong() + ", " + music2.getSong();
  }
}
