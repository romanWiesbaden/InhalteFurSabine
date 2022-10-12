package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
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
