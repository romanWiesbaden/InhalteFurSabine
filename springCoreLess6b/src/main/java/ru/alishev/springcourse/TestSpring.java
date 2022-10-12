package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //Diese Klasse wendet sich an SpringApplicationContext, liest es aus
        // und fügt alle Beans, die dort beschrieben sind in SpingApplicationContext
        // Hier haben wir ApplicationContext erstellt.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
// Wird bekommen Bean in unserem MusicPlayer
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        //Spring bildet ein Objekt mit der Klasse musicPlayer.
     //   Spring nutzt dabei den leeren Konstruktor
        // Bei der Erstellung dieses Objektes wird in das Objekt nichts übergeben
//        ***********************
   /*  So arbeitet Setter*/
       // MusicPlayer musicPlayer1 = new MusicPlayer();
        //         //Nachdem es gebildet wurde, ruft man bei diesem Objekt die Methode setter auf,
        //die der Bezeichnung unserer Dependency entspricht
        //Als argument wird das Bean übergeben, musicBean, dass früher erstellt wurde.
        //so wird die Einfügen der Dependency gemacht
        // MusicPlayer.musicPlayer1 = new MusicPlayer();
      //  musicPlayer1.setMusic();

        System.out.println(musicPlayer.getName());
//        Die Werte wurden erfolgreich eingefügt und wir haben sie mit Getter erfolgreich erhalten
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
