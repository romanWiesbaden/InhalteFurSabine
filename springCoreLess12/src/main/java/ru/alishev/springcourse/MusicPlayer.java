package ru.alishev.springcourse;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Ioc
    // Wir übergeben in die Klasse die Dependency
    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer() {}
    // Mit setMethod wird die Dependency musicBean zugeordnet
    // KamelCase Methode. Spring streicht set und den rest die Grosse Buchstabe wird in die kleine Buchstabe gesetzt
    public void setMusic(Music music){
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
