package main;

import config.ProjectConfig;
import model.Parrot;
import model.Pirate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Pirate pirate = context.getBean(Pirate.class);
        System.out.println(pirate);
    }
}
