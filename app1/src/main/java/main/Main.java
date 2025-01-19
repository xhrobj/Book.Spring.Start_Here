package main;

import config.ProjectConfig;
import model.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class); // Получаем ссылку на бин типа Parrot
        System.out.println("Hello, " + p.getName());

        var greet = context.getBean(String.class);
        System.out.println(greet);

        var n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
