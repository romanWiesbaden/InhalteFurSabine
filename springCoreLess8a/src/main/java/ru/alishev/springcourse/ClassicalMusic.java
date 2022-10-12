package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    // Hier wird die Fabric Methode geschafft
    // Gibt zurück Objekt des Types ClassicalMusic
    public static ClassicalMusic getClassicalMusic(){
            return new ClassicalMusic();
    }

public void doMyInit(){
    System.out.println("I am doing initialization");
}

public void doMyDestroy(){
    System.out.println("I am destructing");
}
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
