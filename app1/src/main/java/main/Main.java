package main;

import config.ProjectConfig;
import model.Parrot;
import model.Pirate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot);

        Pirate pirate = context.getBean(Pirate.class);
        System.out.println(pirate);
    }
}
