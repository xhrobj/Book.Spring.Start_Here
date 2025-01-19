package main;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println("Hello, " + p.getName());

        Parrot p2 = context.getBean("Brewster", Parrot.class);
        System.out.println("Hello, " + p2.getName());

        Parrot p3 = context.getBean("Wilson", Parrot.class);
        System.out.println("Hello, " + p3.getName());

        var greet = context.getBean(String.class);
        System.out.println(greet);

        var n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
