package main;

import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(); // Создание экземпляра контекста Spring

        Parrot parrot = new Parrot();
        parrot.setName("Jameson");

        System.out.println("Hello " + parrot.getName());
    }
}
