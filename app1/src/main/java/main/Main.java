package main;

import config.ProjectConfig;
import model.Parrot;
import model.Pirate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var parrot = new Parrot();
        parrot.setName("Koko");

        var pirate = new Pirate();
        pirate.setName("Joe");
        pirate.setParrot(parrot);

        System.out.println(pirate);
    }
}
